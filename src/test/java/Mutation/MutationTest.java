package Mutation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutationTest {

    IMutation mutation;
    List<Integer> list;

    @Test
    void insertTest() {

        mutation = new MutationInsert();
        list = new ArrayList<>(Arrays.asList(0, 1));

        mutation.infect(list);
        assert (list.equals(Arrays.asList(1, 0)));
    }

    @Test
    void insertTestExpert() {

        mutation = new MutationInsert();

        for (int i = 0; i < 100; i++) {

            list = new ArrayList<>(Arrays.asList(0, 1, 2));

            mutation.infect(list);
            assert (list.equals(Arrays.asList(1, 0, 2)) || list.equals(Arrays.asList(2, 0, 1)) || list.equals(Arrays.asList(0, 2, 1)));
        }
    }

    @Test
    void reverseTest() {

        mutation = new MutationReverse();
        list = new ArrayList<>(Arrays.asList(0, 1));

        mutation.infect(list);
        assert (list.equals(Arrays.asList(1, 0)));
    }

    @Test
    void reverseTestExpert() {

        mutation = new MutationReverse();

        for (int i = 0; i < 100; i++) {

            list = new ArrayList<>(Arrays.asList(0, 1, 2));

            mutation.infect(list);
            assert (list.equals(Arrays.asList(1, 0, 2)) || list.equals(Arrays.asList(0, 2, 1)) || list.equals(Arrays.asList(2, 1, 0)));
        }
    }

    @Test
    void swapTest() {

        mutation = new MutationSwap();
        list = new ArrayList<>(Arrays.asList(0, 1));

        mutation.infect(list);
        assert (list.equals(Arrays.asList(1, 0)));

    }

    @Test
    void swapTestExpert() {

        mutation = new MutationSwap();

        for (int i = 0; i < 100; i++) {

            list = new ArrayList<>(Arrays.asList(0, 1, 2));

            mutation.infect(list);
            assert (list.equals(Arrays.asList(1, 0, 2)) || list.equals(Arrays.asList(0, 2, 1)) || list.equals(Arrays.asList(2, 1, 0)));
        }
    }
}
