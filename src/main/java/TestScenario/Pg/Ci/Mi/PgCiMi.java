package TestScenario.Pg.Ci.Mi;

import Mutation.IMutation;
import Mutation.MutationInsert;
import TestScenario.Pg.Ci.PgCi;

public abstract class PgCiMi extends PgCi {

    public PgCiMi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationInsert();
    }
}
