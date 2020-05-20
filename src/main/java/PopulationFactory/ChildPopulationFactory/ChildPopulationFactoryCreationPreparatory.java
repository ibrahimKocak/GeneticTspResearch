package PopulationFactory.ChildPopulationFactory;

import Populations.Population;

public abstract class ChildPopulationFactoryCreationPreparatory extends ChildPopulationFactory {

    @Override
    protected void prepareToCreate(Population population, int count) {

        init(population, count);

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < length; j++) {

                if (super.template[j]) {

                    populationNew.get(i).getKey().add(parent.get(i).getKey().get(j));
                    parent_temp.get(i).getKey().remove(parent.get(i).getKey().get(j));
                }
            }
        }
    }
}
