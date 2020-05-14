package PopulationFactory.PopulationFactoryChild;

import Model.PathX;
import Populations.Population;

public class PopulationFactoryChildByAdding extends ChildCreationPreparatory {

    @Override
    public void createPopulation(Population population, int count) {

        prepareToCreate(population, count);

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < parent_temp.get(0).getKey().size(); j++)
                populationNew.get(i).getKey().add(parent_temp.get(i).getKey().get(j));
        }
        populationNew.forEach(PathX::commit);
    }

    @Override
    public Population getPopulation() {
        return populationNew;
    }
}
