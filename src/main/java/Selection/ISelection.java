package Selection;

import Populations.Population;
import Populations.PopulationChild;
import Populations.PopulationParent;

public interface ISelection {

    void naturalSelection(Population parents, Population children);
}
