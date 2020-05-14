package TestScenario.Pr.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCiMrSi extends PrCiMr {

    public PrCiMrSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
