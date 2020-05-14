package TestScenario.Pg.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCiMiSs extends PgCiMi {

    public PgCiMiSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
