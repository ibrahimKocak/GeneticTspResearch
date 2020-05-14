package TestScenario.Pr.Ca.Mi;

import Mutation.IMutation;
import Mutation.MutationInsert;
import TestScenario.Pr.Ca.PrCa;

public abstract class PrCaMi extends PrCa {

    public PrCaMi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public IMutation getDefaultMutation() {
        return new MutationInsert();
    }
}
