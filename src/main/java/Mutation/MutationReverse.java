package Mutation;

import java.util.Collections;
import java.util.List;

public class MutationReverse extends RandomTwoPointSorted implements IMutation {

    @Override
    public void infect(List<Integer> list) {

        super.initPoints(list.size());

        Collections.reverse(list.subList(points[0], points[1] + 1));
    }
}
