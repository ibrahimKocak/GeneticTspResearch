package TestScenario.Pr.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCiMiSs extends PrCiMi {

    public PrCiMiSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
