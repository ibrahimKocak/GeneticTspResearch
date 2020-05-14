package TestScenario.Pr.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCaMsSi extends PrCaMs {

    public PrCaMsSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
