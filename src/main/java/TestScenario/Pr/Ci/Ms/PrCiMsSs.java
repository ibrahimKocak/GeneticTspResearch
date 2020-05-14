package TestScenario.Pr.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCiMsSs extends PrCiMs {

    public PrCiMsSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
