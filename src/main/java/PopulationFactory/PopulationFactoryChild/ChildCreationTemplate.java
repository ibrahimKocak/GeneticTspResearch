package PopulationFactory.PopulationFactoryChild;

import Model.PathX;

import java.util.Random;

public class ChildCreationTemplate {

    private final Random random;
    private boolean[] booleans;

    public ChildCreationTemplate() {
        random = new Random();
    }

    public void buildRandomTemplate() {

        booleans = new boolean[PathX.getDistance().length];

        for (int i = 0; i < PathX.getDistance().length; i++)
            booleans[i] = random.nextBoolean();
    }

    public boolean[] getRandomTemplate() {
        return booleans;
    }
}
