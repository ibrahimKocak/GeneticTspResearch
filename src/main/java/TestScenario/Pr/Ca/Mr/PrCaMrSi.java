package TestScenario.Pr.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCaMrSi extends PrCaMr {

    public PrCaMrSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
