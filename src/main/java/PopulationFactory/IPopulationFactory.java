package PopulationFactory;

import Model.IAppComponent;
import Populations.Population;

import java.io.Serializable;

public interface IPopulationFactory extends Serializable, IAppComponent {

    Population getPopulation();
}
