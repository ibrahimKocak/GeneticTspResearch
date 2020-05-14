package TestScenario.Pg.Ci;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByIndexing;
import Populations.PopulationName;
import TestScenario.Pg.Pg;

import java.util.Map;

public abstract class PgCi extends Pg {

    public PgCi(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        super.getDefaultFactoryMap().put(PopulationName.Children, new PopulationFactoryChildByIndexing());
        return factoryMap;
    }
}
