package TestScenario.Pg.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionByIndexing;

public class PgCaMiSi extends PgCaMi {

    public PgCaMiSi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByIndexing();
    }
}
