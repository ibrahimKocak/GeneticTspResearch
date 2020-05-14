package TestScenario.Pg.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCiMsSi extends PgCiMs {

    public PgCiMsSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
