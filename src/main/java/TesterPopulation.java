import Populations.Population;
import TesterParamManager.TesterParamManager;

public class TesterPopulation implements Runnable{

    private final int testCount, iterationCount;
    TesterParamManager testerParamManager;
    private Population parents, children;

     TesterPopulation(int testCount, int iterationCount, TesterParamManager testerParamManager) {

        this.testCount = testCount;
        this.iterationCount = iterationCount;
        this.testerParamManager = testerParamManager;
    }

    private boolean isManagerOk() {

        boolean isOk = true;

        if (testerParamManager.getParentCount() > 0 && testerParamManager.getManagerFactoryParent().size() == 0)
            isOk = false;
        else if (testerParamManager.getChildCount() > 0 && testerParamManager.getManagerFactoryChild().size() == 0)
            isOk = false;
        else if (testerParamManager.getMutationFactor() > 0 && testerParamManager.getManagerMutation().size() == 0)
            isOk = false;
        else if (testerParamManager.getManagerSelection().size() == 0)
            isOk = false;

        return isOk;
    }

    public void start() {

        if (!isManagerOk())
            return;

        System.out.println("\n");

        for (int i = 0; i < testCount; i++) {

            System.out.print(this.getClass().getSimpleName() + " " + i + "\n");
            run();
        }
    }

    @Override
    public void run() {

        double startTime = System.currentTimeMillis();
        createParents();

        for (int i = 0; i < iterationCount; i++) {

            for (int j = 0; j < testerParamManager.getCrossingOverFactor(); j++) {
                createChildren();
                parentSelection();
            }
            for (int j = 0; j < testerParamManager.getMutationFactor(); j++) {
                mutation();
                parentSelection();
            }
        }
        parents.printBestValue();
        System.out.println("Time : " + (System.currentTimeMillis() - startTime) / 1000 + "\n");
    }

    private void createParents() {
        parents = testerParamManager.getManagerFactoryParent().getRandom().getPopulation(testerParamManager.getParentCount());
    }

    private void createChildren() {
        children = testerParamManager.getManagerFactoryChild().getRandom().getPopulation(parents, testerParamManager.getChildCount());
    }

    private void mutation() {

        children.forEach(pathX -> {
            testerParamManager.getManagerMutation().getRandom().infect(pathX.getKey());
            pathX.commit();
        });
    }

    private void parentSelection() {
        testerParamManager.getManagerSelection().getRandom().naturalSelection(parents, children);
    }
}
