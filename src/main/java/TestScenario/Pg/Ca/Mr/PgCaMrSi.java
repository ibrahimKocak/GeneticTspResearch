package TestScenario.Pg.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCaMrSi extends PgCaMr {

    public PgCaMrSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
