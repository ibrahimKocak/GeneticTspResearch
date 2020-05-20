package Mutation;

import Model.IAppComponent;

import java.io.Serializable;
import java.util.List;

public interface IMutation extends Serializable, IAppComponent {

    void infect(List<Integer> list);
}
