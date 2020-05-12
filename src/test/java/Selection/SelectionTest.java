package Selection;

import Model.DistanceInstance1;
import Model.PathX;
import Populations.PopulationChild;
import Populations.PopulationParent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionTest {

    static PopulationParent population_parent;
    static PopulationChild population_child;
    ISelection selection;

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    void setParams() {

        population_parent = new PopulationParent();
        population_child = new PopulationChild();

        population_parent.add(new PathX(new ArrayList<>(Arrays.asList(0, 1, 2, 3))));
        population_parent.add(new PathX(new ArrayList<>(Arrays.asList(0, 1, 3, 2))));
        population_parent.add(new PathX(new ArrayList<>(Arrays.asList(0, 2, 1, 3))));
        population_parent.add(new PathX(new ArrayList<>(Arrays.asList(0, 2, 3, 1))));

        population_child.add(new PathX(new ArrayList<>(Arrays.asList(1, 2, 3, 0))));
        population_child.add(new PathX(new ArrayList<>(Arrays.asList(1, 2, 0, 3))));
        population_child.add(new PathX(new ArrayList<>(Arrays.asList(1, 3, 0, 2))));
        population_child.add(new PathX(new ArrayList<>(population_parent.get(3).getKey())));   //that included in population_parent


        population_parent.get(0).setValue(0);
        population_parent.get(1).setValue(20);
        population_parent.get(2).setValue(15);
        population_parent.get(3).setValue(5);

        population_child.get(0).setValue(35);
        population_child.get(1).setValue(10);
        population_child.get(2).setValue(10);
        population_child.get(3).setValue(5);    //same value with parent
    }

    @Test
    void selectionByBetterThanMaxTest() {

        setParams();
        selection = new SelectionByBetterThanMax();

        selection.naturalSelection(population_parent, population_child);

        assert (population_parent.get(0).getValue().equals(0));
        assert (population_parent.get(1).getValue().equals(5));
        assert (population_parent.get(2).getValue().equals(10));
        assert (population_parent.get(3).getValue().equals(10));
    }

    @Test
    void selectionBySortTest() {

        setParams();
        selection = new SelectionBySorting();

        selection.naturalSelection(population_parent, population_child);

        assert (population_parent.get(0).getValue().equals(0));
        assert (population_parent.get(1).getValue().equals(5));
        assert (population_parent.get(2).getValue().equals(10));
        assert (population_parent.get(3).getValue().equals(10));
    }

    @Test
    void selectionByIndexTest() {

        setParams();
        selection = new SelectionByIndexing();

        selection.naturalSelection(population_parent, population_child);

        assert (population_parent.get(0).getValue().equals(0));
        assert (population_parent.get(1).getValue().equals(10));
        assert (population_parent.get(2).getValue().equals(10));
        assert (population_parent.get(3).getValue().equals(5));
    }
}
