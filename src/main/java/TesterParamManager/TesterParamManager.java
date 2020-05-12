package TesterParamManager;

import java.io.Serializable;

public class TesterParamManager implements Serializable {

    private int parentCount;
    private int childCount;
    private int crossingOverFactor;
    private int mutationFactor;

    private ManagerFactoryParent managerFactoryParent;
    private ManagerFactoryChild managerFactoryChild;
    private ManagerMutation managerMutation;
    private ManagerSelection managerSelection;

    public TesterParamManager() {

        managerFactoryParent = new ManagerFactoryParent();
        managerFactoryChild = new ManagerFactoryChild();
        managerMutation = new ManagerMutation();
        managerSelection = new ManagerSelection();
    }

    public int getParentCount() {
        return parentCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public int getCrossingOverFactor() {
        return crossingOverFactor;
    }

    public int getMutationFactor() {
        return mutationFactor;
    }

    public ManagerFactoryParent getManagerFactoryParent() {
        return managerFactoryParent;
    }

    public ManagerFactoryChild getManagerFactoryChild() {
        return managerFactoryChild;
    }

    public ManagerMutation getManagerMutation() {
        return managerMutation;
    }

    public ManagerSelection getManagerSelection() {
        return managerSelection;
    }

    public void setManagerFactoryParent(int parentCount, ManagerFactoryParent managerFactoryParent) {
        this.parentCount = parentCount;
        this.managerFactoryParent = managerFactoryParent;
    }

    public void setManagerFactoryChild(int childCount, int crossingOverFactor, ManagerFactoryChild managerFactoryChild) {
        this.childCount = childCount;
        this.crossingOverFactor = crossingOverFactor;
        this.managerFactoryChild = managerFactoryChild;
    }

    public void setManagerMutation(int mutationFactor, ManagerMutation managerMutation) {
        this.mutationFactor = mutationFactor;
        this.managerMutation = managerMutation;
    }

    public void setManagerSelection(ManagerSelection managerSelection) {
        this.managerSelection = managerSelection;
    }
}
