package Populations;

import Model.DistanceInstance1;
import Model.PathX;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PopulationTest {

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    @Test
    void getNameTest() {

        PopulationChild populationChild = new PopulationChild();
        PopulationParent populationParent = new PopulationParent();

        assert (populationChild.getName().equals("Children"));
        assert (populationParent.getName().equals("Parents"));
    }

    @Test
    void BestValueTest() {

        PathX pathX0 = new PathX(Arrays.asList(1, 2));
        PathX pathX1 = new PathX(Arrays.asList(1, 2));
        PathX pathX2 = new PathX(Arrays.asList(1, 2));

        pathX0.setValue(8);
        pathX1.setValue(3);
        pathX2.setValue(6);

        PopulationParent population = new PopulationParent();
        population.add(pathX0);
        population.add(pathX1);
        population.add(pathX2);

        assert (population.getBestValue().getValue().equals(pathX1.getValue()));
    }
}
