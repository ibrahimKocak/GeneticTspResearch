package TesterParamManager;

import PopulationFactory.PopulationFactoryParent.PopulationFactoryParent;

import java.util.ArrayList;
import java.util.Random;

public class ManagerFactoryParent extends ArrayList<PopulationFactoryParent> {

    private final Random random;

    public ManagerFactoryParent() {
        random = new Random();
    }

    public PopulationFactoryParent getRandom() {

        return this.get(random.nextInt(this.size()));
    }
}
