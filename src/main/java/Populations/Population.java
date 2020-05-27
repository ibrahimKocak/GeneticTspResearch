package Populations;

import Model.PathX;

import java.util.*;

public abstract class Population extends ArrayList<PathX> implements IPopulation {

    public PopulationName name;

    public PopulationName getName() {
        return name;
    }

    @Override
    public PathX getBestValue() {
        return Collections.min(this, Comparator.comparingInt(PathX::getValue));
    }

    public void printBestValue() {

        PathX bestPathX = getBestValue();
        System.out.println("Best of " + name + "\n" + bestPathX.getKey() + "\t" + bestPathX.getValue());
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("\n").append(name).append("\n");

        for (int i = 0; i < this.size(); i++)
            s.append(i).append("\t").append(this.get(i).getKey()).append("\t\t").append(this.get(i).getValue()).append("\n");

        return s.toString();
    }
}
