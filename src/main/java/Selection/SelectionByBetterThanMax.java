package Selection;

import Model.PathX;
import Populations.Population;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SelectionByBetterThanMax implements ISelection {

    @Override
    public void naturalSelection(Population parents, Population children) {

        PathX worstParent = Collections.max(parents, Comparator.comparingInt(PathX::getValue));

        for (PathX pathXC : children
        ) {
            if (pathXC.getValue() < worstParent.getValue() && !parents.stream().map(PathX::getKey).collect(Collectors.toList()).contains(pathXC.getKey())) {

                parents.add(new PathX(pathXC));
                parents.remove(worstParent);
                worstParent = Collections.max(parents, Comparator.comparingInt(PathX::getValue));
            }
        }
    }
}
