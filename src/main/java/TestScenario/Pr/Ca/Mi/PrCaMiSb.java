package TestScenario.Pr.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCaMiSb extends PrCaMi {

    public PrCaMiSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
