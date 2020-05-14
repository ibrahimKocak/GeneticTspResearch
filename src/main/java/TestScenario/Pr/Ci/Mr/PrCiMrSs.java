package TestScenario.Pr.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCiMrSs extends PrCiMr {

    public PrCiMrSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
