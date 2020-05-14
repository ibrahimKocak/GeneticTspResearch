package TestScenario.Pg.Ca;

import PopulationFactory.IPopulationFactory;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByAdding;
import Populations.PopulationName;
import TestScenario.Pg.Pg;

import java.util.Map;

public abstract class PgCa extends Pg {

    public PgCa(int parentCount, int childCount, int crossingOverFactor, int mutationFactor) {
        super(parentCount, childCount, crossingOverFactor, mutationFactor);
    }

    @Override
    public Map<PopulationName, IPopulationFactory> getDefaultFactoryMap() {
        super.getDefaultFactoryMap().put(PopulationName.Children, new PopulationFactoryChildByAdding());
        return factoryMap;
    }
}
