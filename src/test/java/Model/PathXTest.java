package Model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PathXTest {

    @BeforeAll
    static void init() {

        PathX.setDistanceValues((new DistanceInstance1()));
    }

    @Test
    void setValue() {

        PathX pathX = new PathX(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        pathX.setValue(10);

        assert (pathX.getValue() == 10);
    }

    @Test
    void commit() {

        PathX pathX = new PathX(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        pathX.setValue(Integer.MAX_VALUE);

        pathX.commit();

        assert (pathX.getValue() != Integer.MAX_VALUE);
        assert (pathX.getValue() != 0);
    }
}
