package Mutation;

import java.util.Random;

public abstract class RandomTwoPoint {

    int[] points;

    void initPoints(int length) {

        Random random = new Random();
        points = new int[2];

        points[0] = random.nextInt(length);

        do {
            points[1] = random.nextInt(length);
        } while (points[0] == points[1]);                //yerdeğiştirilecek 2 şehir birbirinden farklı olsun
    }
}
