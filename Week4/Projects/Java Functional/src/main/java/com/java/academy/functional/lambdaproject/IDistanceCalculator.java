package com.java.academy.functional.lambdaproject;

/**
 * Defines the functional interface IDistanceCalculator
 * The interface represents a distance calculator between two cities
 */
@FunctionalInterface
public interface IDistanceCalculator {

    /**
     * Calculates the distance between two cities
     *
     * @param city1 The first city
     * @param city2 The second city
     *
     * @return The calculated distance between two cities
     */
    double calculateDistance(City city1, City city2);

}