package TestScenario;

import Mutation.IMutation;
import PopulationFactory.IPopulationFactory;
import Populations.PopulationName;
import Selection.ISelection;

import java.util.Map;

public interface IScenario {

    Map<PopulationName, IPopulationFactory> getPopulationFactory();

    IMutation getMutation();

    ISelection getSelection();
}
