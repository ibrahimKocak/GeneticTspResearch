package TestScenario.Pg.Ca.Ms;

import Mutation.IMutation;
import Mutation.MutationSwap;
import TestScenario.Pg.Ca.PgCa;

public abstract class PgCaMs extends PgCa {

    public PgCaMs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationSwap();
    }
}
