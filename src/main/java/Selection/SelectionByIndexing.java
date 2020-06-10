package Selection;

import Model.PathX;
import Populations.Population;

import java.util.stream.Collectors;

public class SelectionByIndexing implements ISelection {

    @Override
    public void naturalSelection(Population parents, Population children) {

        int count = children.size();

        for (int i = 0; i < count; i++) {

            boolean isBetterAndNew = true;

            if (children.get(i).getValue() < parents.get(i % parents.size()).getValue() &&
            !parents.stream().map(PathX::getKey).collect(Collectors.toList()).contains(children.get(i).getKey()))
                parents.set(i, new PathX(children.get(i)));
        }
    }

    @Override
    public String getCode() {
        return "Si";
    }
}
