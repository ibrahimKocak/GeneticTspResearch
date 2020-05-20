package PopulationFactory.ChildPopulationFactory;

import Model.PathX;
import Populations.Population;

public class ChildPopulationFactoryByIndexing extends ChildPopulationFactoryCreationPreparatory {

    @Override
    public void createPopulation(Population population, int count) {

        prepareToCreate(population, count);

        for (int i = 0; i < count; i++) {

            int index = 0;
            for (int j = 0; j < length; j++) {

                if (!template[j]) {
                    populationNew.get(i).getKey().add(j, parent_temp.get(i).getKey().get(index));
                    index++;
                }
            }
        }
        populationNew.forEach(PathX::commit);
    }

    @Override
    public Population getPopulation() {
        return populationNew;
    }

    @Override
    public String getCode() {
        return "Ci";
    }
}
