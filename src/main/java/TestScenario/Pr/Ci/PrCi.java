package TestScenario.Pr.Ci;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByIndexing;
import Populations.PopulationName;
import TestScenario.Pr.Pr;

import java.util.Map;

public abstract class PrCi extends Pr {

    public PrCi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        super.getDefaultFactoryMap().put(PopulationName.Children, new PopulationFactoryChildByIndexing());
        return factoryMap;
    }
}
