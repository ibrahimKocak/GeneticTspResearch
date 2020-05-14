package TestScenario.Pr.Ca;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByAdding;
import Populations.PopulationName;
import TestScenario.Pr.Pr;

import java.util.Map;

public abstract class PrCa extends Pr {

    public PrCa(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        super.getDefaultFactoryMap().put(PopulationName.Children, new PopulationFactoryChildByAdding());
        return factoryMap;
    }
}
