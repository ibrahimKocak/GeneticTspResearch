package Selection;

import Model.PathX;
import Populations.Population;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SelectionBySorting implements ISelection {

    public void naturalSelection(Population parents, Population children) {

        int parent_size = parents.size();

        parents.sort(Comparator.comparingInt(PathX::getValue));

        for (PathX pathXC : children
        ) {
            if (pathXC.getValue() < parents.get(parent_size - 1).getValue() &&
                    !parents.stream().map(PathX::getKey).collect(Collectors.toList()).contains(pathXC.getKey()))
                parents.add(new PathX(pathXC));
        }

        parents.sort(Comparator.comparingInt(PathX::getValue));
        parents.removeAll(parents.subList(parent_size, parents.size()));
    }

    @Override
    public String getCode() {
        return "Ss";
    }
}
