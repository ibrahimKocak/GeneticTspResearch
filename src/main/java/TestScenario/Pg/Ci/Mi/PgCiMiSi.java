package TestScenario.Pg.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCiMiSi extends PgCiMi {

    public PgCiMiSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
