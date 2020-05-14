package TestScenario.Pr.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCaMsSs extends PrCaMs {

    public PrCaMsSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
