package TestScenario.Pr.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCaMrSs extends PrCaMr {

    public PrCaMrSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
