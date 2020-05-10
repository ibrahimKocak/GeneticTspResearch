package TesterParamManager;

import PopulationFactory.PopulationFactoryChild.PopulationFactoryChild;

import java.util.ArrayList;
import java.util.Random;

public class ManagerFactoryChild extends ArrayList<PopulationFactoryChild> {

    private final Random random;

    public ManagerFactoryChild() {
        random = new Random();
    }

    public PopulationFactoryChild getRandom() {

        return this.get(random.nextInt(this.size()));
    }
}
