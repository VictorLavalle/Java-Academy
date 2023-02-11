package com.java.academy.functional.lambdaproject;

public class OrderManagement {

    /**
     *  This a simple Java class that holds a reference to a IDistanceCalculator
     * The purpose of this class is to allow for a flexible way
     * of calculating distances between two cities, by allowing
     * the calculation algorithm to be changed at runtime through
     * the use of the DistanceCalculator interface and the setter method.
     */

    private IDistanceCalculator distanceCalculator;
    /**
     * Constructor for OrderManagement.
     * @param distanceCalculator the distance calculator to use
     */
    public OrderManagement(IDistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }
    /**
     * Sets the distance calculator to use.
     * @param distanceCalculator the distance calculator to use
     */
    public void setDistanceCalculator(IDistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }



}
