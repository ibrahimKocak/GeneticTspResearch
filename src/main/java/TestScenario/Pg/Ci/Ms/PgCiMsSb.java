package TestScenario.Pg.Ci.Ms;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCiMsSb extends PgCiMs {

    public PgCiMsSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
