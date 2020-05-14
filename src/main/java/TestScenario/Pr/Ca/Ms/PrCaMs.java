package TestScenario.Pr.Ca.Ms;

import Mutation.IMutation;
import Mutation.MutationSwap;
import TestScenario.Pr.Ca.PrCa;

public abstract class PrCaMs extends PrCa {

    public PrCaMs(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationSwap();
    }
}
