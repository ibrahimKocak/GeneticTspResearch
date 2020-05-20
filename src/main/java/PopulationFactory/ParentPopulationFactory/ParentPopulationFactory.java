package PopulationFactory.ParentPopulationFactory;

import PopulationFactory.IPopulationFactory;
import Populations.PopulationParent;

public abstract class ParentPopulationFactory implements IPopulationFactory {

    protected PopulationParent population;

    public abstract void createPopulation(int count);
}
