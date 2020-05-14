package TestScenario.Pg.Ci.Ms;

import Mutation.IMutation;
import Mutation.MutationSwap;
import TestScenario.Pg.Ci.PgCi;

public abstract class PgCiMs extends PgCi {

    public PgCiMs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationSwap();
    }
}
