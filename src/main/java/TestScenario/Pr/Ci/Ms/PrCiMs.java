package TestScenario.Pr.Ci.Ms;

import Mutation.IMutation;
import Mutation.MutationSwap;
import TestScenario.Pr.Ci.PrCi;

public abstract class PrCiMs extends PrCi {

    public PrCiMs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationSwap();
    }
}
