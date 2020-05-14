package TestScenario.Pg.Ca.Mi;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCaMiSb extends PgCaMi {

    public PgCaMiSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
