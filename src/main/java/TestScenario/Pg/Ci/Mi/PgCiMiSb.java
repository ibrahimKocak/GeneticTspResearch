package TestScenario.Pg.Ci.Mi;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCiMiSb extends PgCiMi {

    public PgCiMiSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
