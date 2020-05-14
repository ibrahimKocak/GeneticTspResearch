package TestScenario.Pg.Ci.Mr;

import Mutation.IMutation;
import Mutation.MutationReverse;
import TestScenario.Pg.Ci.PgCi;

public abstract class PgCiMr extends PgCi {

    public PgCiMr(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationReverse();
    }
}
