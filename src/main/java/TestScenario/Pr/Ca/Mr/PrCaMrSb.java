package TestScenario.Pr.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCaMrSb extends PrCaMr {

    public PrCaMrSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
