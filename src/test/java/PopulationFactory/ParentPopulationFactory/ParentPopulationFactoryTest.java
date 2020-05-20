package PopulationFactory.ParentPopulationFactory;

import Model.DistanceInstance1;
import Model.PathX;
import Populations.Population;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ParentPopulationFactoryTest {

    ParentPopulationFactory parentPopulationFactory;

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    @Test
    void randomParentFactoryTest() {

        parentPopulationFactory = new ParentPopulationFactoryRandom();

        parentPopulationFactory.createPopulation(5);
        Population population = parentPopulationFactory.getPopulation();

        assert (population.size() == 5);
        assert (population.get(0).getValue() != 0);
    }

    @Test
    void greedyParentFactoryTest() {

        parentPopulationFactory = new ParentPopulationFactoryGreedy();

        parentPopulationFactory.createPopulation(1);
        Population population = parentPopulationFactory.getPopulation();

        PathX pathx = new PathX(new ArrayList<>(Arrays.asList(0, 12, 14, 18, 20, 7, 4, 11, 9, 8, 16, 13, 15, 1, 5, 17, 19, 6, 2, 10, 3)));

        assert (population.getBestValue().equals(pathx));
    }
}