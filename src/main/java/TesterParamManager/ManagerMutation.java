package TesterParamManager;

import Mutation.IMutation;

import java.util.ArrayList;
import java.util.Random;

public class ManagerMutation extends ArrayList<IMutation> {

    private final Random random;

    public ManagerMutation() {
        random = new Random();
    }

    public IMutation getRandom() {

        return this.get(random.nextInt(this.size()));
    }
}
