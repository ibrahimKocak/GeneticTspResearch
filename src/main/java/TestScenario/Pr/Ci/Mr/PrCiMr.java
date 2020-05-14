package TestScenario.Pr.Ci.Mr;

import Mutation.IMutation;
import Mutation.MutationReverse;
import TestScenario.Pr.Ci.PrCi;

public abstract class PrCiMr extends PrCi {

    public PrCiMr(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationReverse();
    }
}
