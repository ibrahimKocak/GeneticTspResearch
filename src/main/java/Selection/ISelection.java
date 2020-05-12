package Selection;

import Populations.Population;

import java.io.Serializable;

public interface ISelection extends Serializable {

    void naturalSelection(Population parents, Population children);
}
