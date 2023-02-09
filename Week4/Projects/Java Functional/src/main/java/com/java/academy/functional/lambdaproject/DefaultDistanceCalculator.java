package com.java.academy.functional.lambdaproject;

public class DefaultDistanceCalculator implements IDistanceCalculator {

    /**
     * Override the method from the interface IDistanceCalculator
     *
     * @param city1 the first city
     * @param city2 the second city
     * @return 0 as the distance between two cities
     */
    @Override
    public double calculateDistance(City city1, City city2) {
        return 0;
    }


}
