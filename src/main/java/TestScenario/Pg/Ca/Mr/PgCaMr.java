package TestScenario.Pg.Ca.Mr;

import Mutation.IMutation;
import Mutation.MutationReverse;
import TestScenario.Pg.Ca.PgCa;

public abstract class PgCaMr extends PgCa {

    public PgCaMr(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationReverse();
    }
}
