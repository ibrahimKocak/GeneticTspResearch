package TestScenario.Pg.Ci.Mr;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCiMrSb extends PgCiMr {

    public PgCiMrSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
