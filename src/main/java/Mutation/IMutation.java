package Mutation;

import java.io.Serializable;
import java.util.List;

public interface IMutation extends Serializable {

    void infect(List<Integer> list);
}
