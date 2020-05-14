package TestScenario.Pr.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCiMsSi extends PrCiMs {

    public PrCiMsSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
