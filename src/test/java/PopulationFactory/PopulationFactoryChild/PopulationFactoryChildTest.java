package PopulationFactory.PopulationFactoryChild;

import Model.DistanceInstance1;
import Model.PathX;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParent;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParentRandom;
import Populations.Population;
import Populations.PopulationParent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PopulationFactoryChildTest {

    Population population, populationNew;
    PopulationFactoryParent populationFactoryParent;
    PopulationFactoryChild populationFactoryChild;
    ChildCreationTemplate childCreationTemplate;
    Random random;

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    @Test
    void byAddingChildPopulationFactoryTest() {

        populationFactoryParent = new PopulationFactoryParentRandom();
        populationFactoryChild = new PopulationFactoryChildByAdding();
        population = new PopulationParent();
        random = new Random();

        population = populationFactoryParent.getPopulation(2);

        PopulationFactory.PopulationFactoryChild.ChildCreationTemplate childCreationTemplate = new PopulationFactory.PopulationFactoryChild.ChildCreationTemplate();
        childCreationTemplate.buildRandomTemplate();
        populationNew = populationFactoryChild.getPopulation(population, 5);

        assert (populationNew.size() == 5);

        for (int i = 0; i < 5; i++) {
            assert (populationNew.get((new Random()).nextInt(populationNew.size())).getKey().contains(i));
            assert (populationNew.get(i).getKey().size() == population.get(0).getKey().size());
        }
    }

    @Test
    void byIndexingChildPopulationFactoryTest() {

        populationFactoryChild = new PopulationFactoryChildByIndexing();
        random = new Random();

        PathX pathX0 = new PathX(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)));
        PathX pathX1 = new PathX(new ArrayList<>(Arrays.asList(4, 3, 2, 1, 0)));

        population = new PopulationParent();
        population.add(pathX0);
        population.add(pathX1);

        populationNew = populationFactoryChild.getPopulation(population, 5);

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
