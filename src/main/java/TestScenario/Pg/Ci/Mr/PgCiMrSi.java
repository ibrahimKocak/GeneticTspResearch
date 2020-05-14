package TestScenario.Pg.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCiMrSi extends PgCiMr {

    public PgCiMrSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
