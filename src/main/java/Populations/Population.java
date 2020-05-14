package Populations;

import Model.PathX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Population extends ArrayList<PathX> {

    public PopulationName name;

    public PopulationName getName() {
        return name;
    }

    public void printBestValue() {
        System.out.println("Best:\t" + getBestValue().getKey() + "\t\t" + getBestValue().getValue());
    }

    public PathX getBestValue() {
        return Collections.min(this, Comparator.comparingInt(PathX::getValue));
    }

    public void print() {

        System.out.println("\n\n" + this.name + "\n");

        for (int i = 0; i < this.size(); i++)
            System.out.println(i + "\t" + this.get(i));

        System.out.println("\n");
    }
}
