package TestScenario.Pg.Ca.Ms;

import Selection.ISelection;
import Selection.SelectionByBetterThanMax;

public class PgCaMsSb extends PgCaMs {

    public PgCaMsSb(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public ISelection getDefaultSelection() {
        return new SelectionByBetterThanMax();
    }
}
