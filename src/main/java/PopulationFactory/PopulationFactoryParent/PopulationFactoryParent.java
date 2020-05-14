package PopulationFactory.PopulationFactoryParent;

import PopulationFactory.IPopulationFactory;
import Populations.PopulationParent;

public abstract class PopulationFactoryParent implements IPopulationFactory {

    protected PopulationParent population;

    public abstract void createPopulation(int count);
}
