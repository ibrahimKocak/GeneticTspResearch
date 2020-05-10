package PopulationFactory.PopulationFactoryParent;

import Populations.PopulationParent;

public abstract class PopulationFactoryParent {

    protected PopulationParent population;

    public abstract PopulationParent getPopulation(int count);
}
