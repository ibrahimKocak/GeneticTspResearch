package TestScenario.Pg.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionBySorting;

public class PgCaMsSs extends PgCaMs {

    public PgCaMsSs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionBySorting();
    }
}
