import Populations.Population;
import TestScenario.ScenarioPCMS;

import java.io.Serializable;

public class Tester implements Runnable, Serializable {

    private final String name;
    private final int iterationCount;
    private final ScenarioPCMS scenarioPCMS;
    private Population parents, children;
    private Thread t;

    Tester(ScenarioPCMS scenarioPCMS, int iterationCount) {

        this.name = scenarioPCMS.getClass().getSimpleName();
        this.iterationCount = iterationCount;
        this.scenarioPCMS = scenarioPCMS;
    }

    public void start() {

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

            for (int j = 0; j < scenarioPCMS.getCrossingOverFactor(); j++) {
                createChildren();
                parentSelection();
            }
            for (int j = 0; j < scenarioPCMS.getMutationFactor(); j++) {
                mutation();
                parentSelection();
            }
        }
        System.out.println(name + "->");
        parents.printBestValue();
        System.out.println("Time : " + (System.currentTimeMillis() - startTime) / 1000 + "\n");
    }

    private void createParents() {
        parents = scenarioPCMS.getPopulationParent();
    }

    private void createChildren() {
        children = scenarioPCMS.getPopulationChild(parents);
    }

    private void mutation() {

        children.forEach(pathX -> {
            scenarioPCMS.getMutation().infect(pathX.getKey());
            pathX.commit();
        });
    }

    private void parentSelection() {
        scenarioPCMS.getSelection().naturalSelection(parents, children);
    }

    public ScenarioPCMS getScenarioPCMS() {
        return scenarioPCMS;
    }
}
