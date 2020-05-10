package Selection;

import Model.PathX;
import Populations.Population;
import Populations.PopulationChild;
import Populations.PopulationParent;

public class SelectionByIndex implements ISelection {

    @Override
    public void naturalSelection(Population parents, Population children) {

        int count = children.size();

        for (int i = 0; i < count; i++) {

            boolean isBetterAndNew = true;

            if (children.get(i).getValue() > parents.get(i % parents.size()).getValue()) {

                isBetterAndNew = false;
            } else {
                for (PathX p : parents) {

                    if (children.get(i).getKey().equals(p.getKey())) {
                        isBetterAndNew = false;
                        break;
                    }
                }
            }

            if (isBetterAndNew)
                parents.set(i, new PathX(children.get(i)));
        }
    }
}
