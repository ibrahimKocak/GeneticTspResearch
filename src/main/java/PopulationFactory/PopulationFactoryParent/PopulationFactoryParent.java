package PopulationFactory.PopulationFactoryParent;

import Populations.PopulationParent;

import java.io.Serializable;

public abstract class PopulationFactoryParent implements Serializable {

    protected PopulationParent population;

    public abstract PopulationParent getPopulation(int count);
}
