package PopulationFactory.PopulationFactoryParent;

import Model.PathX;
import Populations.PopulationParent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PopulationFactoryParentRandom extends PopulationFactoryParent {

    @Override
    public PopulationParent getPopulation(int count) {

        population = new PopulationParent();
        List<Integer> list_temp;

        for (int i = 0; i < count; i++) {

            list_temp = new ArrayList<>();

            for (int j = 0; j < PathX.getDistance().length; j++)
                list_temp.add(j);

            Collections.shuffle(list_temp);
            population.add(new PathX(list_temp));
        }
        return population;
    }
}
