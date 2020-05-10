package Mutation;

import java.util.Arrays;

public abstract class RandomTwoPointSorted extends RandomTwoPoint {

    void initPoints(int length) {

        super.initPoints(length);

        Arrays.sort(points);
    }
}
