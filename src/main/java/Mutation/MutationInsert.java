package Mutation;

import java.util.Collections;
import java.util.List;

public class MutationInsert extends RandomTwoPointSorted implements IMutation {

    @Override
    public void infect(List<Integer> list) {

        super.initPoints(list.size());

        Collections.rotate(list.subList(points[0], points[1] + 1), 1);
    }

    @Override
    public String getCode() {
        return "Mi";
    }
}
