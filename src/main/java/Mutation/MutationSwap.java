package Mutation;

import java.util.Collections;
import java.util.List;

public class MutationSwap extends RandomTwoPoint implements IMutation {

    @Override
    public void infect(List<Integer> list) {

        super.initPoints(list.size());

        Collections.swap(list, points[0], points[1]);
    }

    @Override
    public String getCode() {
        return "Ms";
    }
}
