package TestScenario.Pg.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCiMrSs extends PgCiMr {

    public PgCiMrSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
