package TestScenario.Pr.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCiMiSi extends PrCiMi {

    public PrCiMiSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
