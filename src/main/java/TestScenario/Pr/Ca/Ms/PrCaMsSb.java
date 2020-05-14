package TestScenario.Pr.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PrCaMsSb extends PrCaMs {

    public PrCaMsSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
