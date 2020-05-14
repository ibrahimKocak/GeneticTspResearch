package TestScenario.Pr.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCiMiSb extends PrCiMi {

    public PrCiMiSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
