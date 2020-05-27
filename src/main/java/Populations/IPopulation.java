package Populations;

import Model.PathX;

import java.util.Map;

public interface IPopulation {

    PopulationName getName();
    PathX getBestValue();
    void printBestValue();
}
