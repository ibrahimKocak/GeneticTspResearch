import Mutation.IMutation;
import PopulationFactory.ChildPopulationFactory.ChildPopulationFactory;
import PopulationFactory.ParentPopulationFactory.ParentPopulationFactory;
import Populations.Population;
import Selection.ISelection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tester implements Runnable, Serializable {

    private final int parentCount, childCount, crossingOverFactor, mutationFactor, iterationCount;
    private final List<ParentPopulationFactory> parentFactories;
    private final List<ChildPopulationFactory> childFactories;
    private final List<IMutation> mutations;
    private final List<ISelection> selections;
    private final Random random;
    private String codeParentFactories = "", codeChildFactories = "", codeMutations = "", codeSelections = "";
    private Population parents, children;
    private Thread t;

    public Tester(int parentCount, int childCount, int crossingOverFactor, int mutationFactor, int iterationCount) {
        this.parentCount = parentCount;
        this.childCount = childCount;
        this.crossingOverFactor = crossingOverFactor;
        this.mutationFactor = mutationFactor;
        this.iterationCount = iterationCount;
        parentFactories = new ArrayList<>();
        childFactories = new ArrayList<>();
        mutations = new ArrayList<>();
        selections = new ArrayList<>();
        random = new Random();
    }

    public void start() {

        try {
            if (parentFactories.size() < 1)
                throw new Exception("Parent Factories is empty, add one.", new NoSuchElementException());
            if (childFactories.size() < 1)
                throw new Exception("Child Factories is empty, add one.", new NoSuchElementException());
            if (selections.size() < 1)
                throw new Exception("Selection is empty, add one.", new NoSuchElementException());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    @Override
    public void run() {

        double startTime = System.currentTimeMillis();
        createParents();

        for (int i = 0; i < iterationCount; i++) {

            for (int j = 0; j < crossingOverFactor; j++) {
                createChildren();
                parentSelection();
            }
            if (mutations.size() > 0)
                for (int j = 0; j < mutationFactor; j++) {
                    mutation();
                    parentSelection();
                }
        }
        System.out.println(codeParentFactories + codeChildFactories + codeMutations + codeSelections + "->");
        parents.printBestValue();
        System.out.println("Time : " + (System.currentTimeMillis() - startTime) / 1000 + "\n");
    }

    private void createParents() {
        ParentPopulationFactory factoryParent = parentFactories.get(random.nextInt(parentFactories.size()));
        factoryParent.createPopulation(parentCount);
        parents = factoryParent.getPopulation();
    }

    private void createChildren() {
        ChildPopulationFactory factoryChild = childFactories.get(random.nextInt(childFactories.size()));
        factoryChild.createPopulation(parents, childCount);
        children = factoryChild.getPopulation();
    }

    private void mutation() {

        children.forEach(pathX -> {
            mutations.get(random.nextInt(mutations.size())).infect(pathX.getKey());
            pathX.commit();
        });
    }

    private void parentSelection() {
        selections.get(random.nextInt(parentFactories.size())).naturalSelection(parents, children);
    }

    public void add(ParentPopulationFactory parentFactory) {
        parentFactories.add(parentFactory);
        codeParentFactories += parentFactory.getCode();
    }

    public void add(ChildPopulationFactory childFactory) {
        childFactories.add(childFactory);
        codeChildFactories += childFactory.getCode();
    }

    public void add(IMutation mutation) {
        mutations.add(mutation);
        codeMutations += mutation.getCode();
    }

    public void add(ISelection selection) {
        selections.add(selection);
        codeSelections += selection.getCode();
    }
}
