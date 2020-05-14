package TestScenario.Pr.Ca.Mr;

import Mutation.IMutation;
import Mutation.MutationReverse;
import TestScenario.Pr.Ca.PrCa;

public abstract class PrCaMr extends PrCa {

    public PrCaMr(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationReverse();
    }
}
