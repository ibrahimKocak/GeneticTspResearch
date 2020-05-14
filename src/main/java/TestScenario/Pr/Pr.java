package TestScenario.Pr;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParentRandom;
import Populations.PopulationName;
import TestScenario.ScenarioPCMS;

import java.util.HashMap;
import java.util.Map;

public abstract class Pr extends ScenarioPCMS {

    public Pr(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        factoryMap = new HashMap<>();
        factoryMap.put(PopulationName.Parents, new PopulationFactoryParentRandom());
        return factoryMap;
    }
}
