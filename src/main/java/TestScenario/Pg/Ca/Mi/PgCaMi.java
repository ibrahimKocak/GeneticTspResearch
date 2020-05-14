package TestScenario.Pg.Ca.Mi;

import Mutation.IMutation;
import Mutation.MutationInsert;
import TestScenario.Pg.Ca.PgCa;

public abstract class PgCaMi extends PgCa {

    public PgCaMi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationInsert();
    }
}
