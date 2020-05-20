package Selection;

import Model.IAppComponent;
import Populations.Population;

import java.io.Serializable;

public interface ISelection extends Serializable, IAppComponent {

    void naturalSelection(Population parents, Population children);
}
