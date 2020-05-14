package TestScenario.Pr.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PrCaMiSi extends PrCaMi {

    public PrCaMiSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
