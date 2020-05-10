package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class PathX implements Map.Entry<List<Integer>, Integer> {

    private final List<Integer> cities;
    private int solution;
    private static int[][] distance = {};

    public PathX(List<Integer> cities) {

        checkDistance();
        this.cities = new ArrayList<>(cities);
        commit();
    }

    public PathX(PathX pathX) {

        checkDistance();
        cities = new ArrayList<>(pathX.cities);
        solution = pathX.solution;
    }

    public void commit() {

        int cost = 0, citySize = cities.size();
        for (int i = 0; i < citySize - 1; i++)
            cost += distance[cities.get(i)][cities.get(i + 1)];
        solution = cost;
    }

    @Override
    public String toString() {
        return "" + cities +
                "\t\t" + solution;
    }

    @Override
    public List<Integer> getKey() {
        return cities;
    }

    @Override
    public Integer getValue() {
        return solution;
    }

    @Override
    public Integer setValue(Integer value) {
        solution = value;
        return solution;
    }

    public static int[][] getDistance() {
        return distance;
    }

    public static void setDistanceValues(IDistanceValues distanceValues) {
        distance = distanceValues.getValues();
    }

    void checkDistance() {
        if (distance.length == 0) {
            Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());
            LOGGER.warning("Attention!!! Distance values not set for " + this.getClass().getSimpleName() + ".class.");
        }
    }

    public boolean equals(PathX pathX) {
        return this.getKey().equals(pathX.getKey()) && this.getValue().equals(pathX.getValue());
    }
}
