package PopulationFactory.ChildPopulationFactory;

import Model.DistanceInstance1;
import Model.PathX;
import PopulationFactory.ParentPopulationFactory.ParentPopulationFactory;
import PopulationFactory.ParentPopulationFactory.ParentPopulationFactoryRandom;
import Populations.Population;
import Populations.PopulationParent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ChildPopulationFactoryTest {

    Population population, populationNew;
    ParentPopulationFactory parentPopulationFactory;
    ChildPopulationFactory childPopulationFactory;
    ChildCreationTemplate childCreationTemplate;
    Random random;

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    @Test
    void byAddingChildPopulationFactoryTest() {

        parentPopulationFactory = new ParentPopulationFactoryRandom();
        childPopulationFactory = new ChildPopulationFactoryByAdding();
        population = new PopulationParent();
        random = new Random();

        parentPopulationFactory.createPopulation(2);
        population = parentPopulationFactory.getPopulation();

        PopulationFactory.ChildPopulationFactory.ChildCreationTemplate childCreationTemplate = new PopulationFactory.ChildPopulationFactory.ChildCreationTemplate();
        childCreationTemplate.buildRandomTemplate();
        childPopulationFactory.createPopulation(population, 5);
        populationNew = childPopulationFactory.getPopulation();

        assert (populationNew.size() == 5);

        for (int i = 0; i < 5; i++) {
            assert (populationNew.get((new Random()).nextInt(populationNew.size())).getKey().contains(i));
            assert (populationNew.get(i).getKey().size() == population.get(0).getKey().size());
        }
    }

    @Test
    void byIndexingChildPopulationFactoryTest() {

        childPopulationFactory = new ChildPopulationFactoryByIndexing();
        random = new Random();

        PathX pathX0 = new PathX(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)));
        PathX pathX1 = new PathX(new ArrayList<>(Arrays.asList(4, 3, 2, 1, 0)));

        population = new PopulationParent();
        population.add(pathX0);
        population.add(pathX1);

        childPopulationFactory.createPopulation(population, 5);
        populationNew = childPopulationFactory.getPopulation();

        assert (populationNew.size() == 5);

        for (int i = 0; i < 5; i++)
            assert (populationNew.get((new Random()).nextInt(populationNew.size())).getKey().contains(i));
    }

    @Test
    void templateRandomTest() {

        childCreationTemplate = new ChildCreationTemplate();

        childCreationTemplate.buildRandomTemplate();

        assert (childCreationTemplate.getRandomTemplate().length == PathX.getDistance().length);
    }
}
