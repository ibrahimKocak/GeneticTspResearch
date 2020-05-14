package TestScenario.Pr.Ci.Mi;

import Mutation.IMutation;
import Mutation.MutationInsert;
import TestScenario.Pr.Ci.PrCi;

public abstract class PrCiMi extends PrCi {

    public PrCiMi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationInsert();
    }
}
