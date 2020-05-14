package TestScenario.Pr.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PrCaMiSs extends PrCaMi {

    public PrCaMiSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
