package PopulationFactory.PopulationFactoryParent;

import Model.PathX;
import Populations.Population;
import Populations.PopulationParent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PopulationFactoryParentGreedy extends PopulationFactoryParent {

    @Override
    public void createPopulation(int count) {

        if (count > PathX.getDistance().length) {
            Logger LOGGER = Logger.getLogger(this.getClass().getName());
            LOGGER.warning("Greedy parents become duplicates when their count is more than their length!\nCount = " + count + ", Length = " + PathX.getDistance().length);
        }

        population = new PopulationParent();
        List<Integer> list;

        for (int k = 0; k < count; k++) {

            list = new ArrayList<>();

            for (int i = 0; i < PathX.getDistance().length; i++)
                if (i == k % PathX.getDistance().length)
                    list.add(0, i);
                else
                    list.add(i);

            for (int i = 0; i < list.size() - 1; i++) {

                int nearestCity = i + 1;
                int nearestCityCost = PathX.getDistance()[list.get(i)][list.get(i + 1)];

                for (int j = i + 2; j < list.size(); j++) {

                    if (PathX.getDistance()[list.get(i)][list.get(j)] < nearestCityCost) {
                        nearestCity = j;
                        nearestCityCost = PathX.getDistance()[list.get(i)][list.get(j)];
                    }
                }

                if (i + 1 != nearestCity)
                    Collections.swap(list, i + 1, nearestCity);
            }
            population.add(new PathX(list));
        }
    }

    @Override
    public Population getPopulation() {
        return population;
    }
}
