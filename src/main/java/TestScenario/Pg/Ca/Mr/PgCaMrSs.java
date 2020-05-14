package TestScenario.Pg.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCaMrSs extends PgCaMr {

    public PgCaMrSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
