package TesterParamManager;

import Selection.ISelection;

import java.util.ArrayList;
import java.util.Random;

public class ManagerSelection extends ArrayList<ISelection> {

    private final Random random;

    public ManagerSelection() {
        random = new Random();
    }

    public ISelection getRandom() {

        return this.get(random.nextInt(this.size()));
    }
}
