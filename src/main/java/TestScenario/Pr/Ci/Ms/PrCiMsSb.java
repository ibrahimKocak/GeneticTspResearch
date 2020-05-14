package TestScenario.Pr.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCiMsSb extends PrCiMs {

    public PrCiMsSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
