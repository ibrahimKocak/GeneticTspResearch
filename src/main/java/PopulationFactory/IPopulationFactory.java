package PopulationFactory;

import Populations.Population;

import java.io.Serializable;

public interface IPopulationFactory extends Serializable {

    Population getPopulation();
}
