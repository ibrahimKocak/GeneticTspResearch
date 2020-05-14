package TestScenario.Pg.Ca.Mr;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCaMrSb extends PgCaMr {

    public PgCaMrSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
