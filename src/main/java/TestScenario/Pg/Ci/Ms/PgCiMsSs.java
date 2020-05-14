package TestScenario.Pg.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCiMsSs extends PgCiMs {

    public PgCiMsSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
