package TestScenario;

import Mutation.IMutation;
import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChild;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParent;
import Populations.Population;
import Populations.PopulationName;
import Selection.ISelection;

import java.util.Map;

public abstract class ScenarioPCMS implements IScenario {

    protected Map<PopulationName, IPopulationFactory> factoryMap;
    protected IMutation mutation;
    protected ISelection selection;
    int parentCount, childCount, crossingOverFactor, mutationFactor;

    public ScenarioPCMS(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {

        this.parentCount = parentCount;
        this.childCount = childCount;
        this.crossingOverFactor = crossingOverFactor;
        this.mutationFactor = mutationFactor;
        factoryMap = getDefaultFactoryMap();
        mutation = getDefaultMutation();
        selection = getDefaultSelection();
    }

    public int getParentCount() {
        return parentCount;
    }

    public void setParentCount(int parentCount) {
        this.parentCount = parentCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getCrossingOverFactor() {
        return crossingOverFactor;
    }

    public void setCrossingOverFactor(int crossingOverFactor) {
        this.crossingOverFactor = crossingOverFactor;
    }

    public int getMutationFactor() {
        return mutationFactor;
    }

    public void setMutationFactor(int mutationFactor) {
        this.mutationFactor = mutationFactor;
    }

    public abstract Map<PopulationName, IPopulationFactory> getDefaultFactoryMap();

    public abstract ISelection getDefaultSelection();

    public abstract IMutation getDefaultMutation();

    public Population getPopulationParent() {
        ((PopulationFactoryParent) factoryMap.get(PopulationName.Parents)).createPopulation(parentCount);
        return factoryMap.get(PopulationName.Parents).getPopulation();
    }

    public Population getPopulationChild(Population parents) {
        ((PopulationFactoryChild) factoryMap.get(PopulationName.Children)).createPopulation(parents, childCount);
        return factoryMap.get(PopulationName.Children).getPopulation();
    }

    @Override
    public IMutation getMutation() {
        return mutation;
    }

    @Override
    public ISelection getSelection() {
        return selection;
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getPopulationFactory() {
        return factoryMap;
    }

    @Override
    public String toString() {
        return toName() + " -> " +
                factoryMap.get(PopulationName.Parents).getClass().getSimpleName() +
                ",\t" + factoryMap.get(PopulationName.Children).getClass().getSimpleName() +
                ",\t" + mutation.getClass().getSimpleName() +
                ",\t" + selection.getClass().getSimpleName();
    }

    public String toName() {
        return "" + factoryMap.get(PopulationName.Parents).getClass().getSimpleName().toCharArray()[17] +
                factoryMap.get(PopulationName.Parents).getClass().getSimpleName().toLowerCase().toCharArray()[23] +
                factoryMap.get(PopulationName.Children).getClass().getSimpleName().toCharArray()[17] +
                factoryMap.get(PopulationName.Children).getClass().getSimpleName().toLowerCase().toCharArray()[24] +
                mutation.getClass().getSimpleName().toCharArray()[0] +
                mutation.getClass().getSimpleName().toLowerCase().toCharArray()[8] +
                selection.getClass().getSimpleName().toCharArray()[0] +
                selection.getClass().getSimpleName().toLowerCase().toCharArray()[11];
    }
}
