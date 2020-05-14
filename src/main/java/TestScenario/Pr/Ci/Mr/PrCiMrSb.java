package TestScenario.Pr.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCiMrSb extends PrCiMr {

    public PrCiMrSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
