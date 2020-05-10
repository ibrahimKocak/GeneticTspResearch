package PopulationFactory.PopulationFactoryChild;

import Model.PathX;
import Populations.Population;
import Populations.PopulationChild;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PopulationFactoryChild {

    protected PopulationChild populationNew;
    protected int length;


    Population parent, parent_temp;
    boolean[] template;

    void init(Population population, int count) {

        populationNew = new PopulationChild();
        parent = new PopulationChild();
        parent_temp = new PopulationChild();
        ChildCreationTemplate childCreationTemplate = new ChildCreationTemplate();
        childCreationTemplate.buildRandomTemplate();
        this.template = childCreationTemplate.getRandomTemplate();

        for (int i = 0; i < count; i++) {
            populationNew.add(new PathX(new ArrayList<>()));
            parent.add(population.get(i%population.size()));
            parent_temp.add(new PathX(population.get(i%population.size())));
        }
        Collections.shuffle(parent_temp);

        length = population.get(0).getKey().size();
    }

    abstract void prepareToCreate(Population population, int count);

    public abstract PopulationChild getPopulation(Population population, int count);

}
