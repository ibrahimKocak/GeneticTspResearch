package PopulationFactory.PopulationFactoryChild;

import Model.PathX;
import Populations.Population;
import Populations.PopulationChild;

public class PopulationFactoryChildByAdding extends ChildCreationPreparatory {

    @Override
    public PopulationChild getPopulation(Population population, int count) {

        prepareToCreate(population, count);

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < parent_temp.get(0).getKey().size(); j++)
                populationNew.get(i).getKey().add(parent_temp.get(i).getKey().get(j));
        }
        populationNew.forEach(PathX::commit);

        return populationNew;
    }
}
