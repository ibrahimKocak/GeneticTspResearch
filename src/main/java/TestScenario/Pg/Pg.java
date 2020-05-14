package TestScenario.Pg;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParentGreedy;
import Populations.PopulationName;
import TestScenario.ScenarioPCMS;

import java.util.HashMap;
import java.util.Map;

public abstract class Pg extends ScenarioPCMS {

    public Pg(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        factoryMap = new HashMap<>();
        factoryMap.put(PopulationName.Parents, new PopulationFactoryParentGreedy());
        return factoryMap;
    }
}
