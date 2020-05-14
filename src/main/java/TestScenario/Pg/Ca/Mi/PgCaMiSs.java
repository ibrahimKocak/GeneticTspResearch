package TestScenario.Pg.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCaMiSs extends PgCaMi {

    public PgCaMiSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
