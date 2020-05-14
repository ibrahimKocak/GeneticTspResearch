package TestScenario.Pg.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCaMsSi extends PgCaMs {

    public PgCaMsSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
