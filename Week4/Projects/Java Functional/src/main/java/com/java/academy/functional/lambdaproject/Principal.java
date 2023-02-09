package com.java.academy.functional.lambdaproject;

public class Principal {

    public static void main(String[] args) {


        // ========== Lambda function demo ==========


        // The OrderManagement class is used to demonstrate both lambda functions and method references.
        // The setDistanceCalculator method is used to set the DistanceCalculator reference
        // to an anonymous inner class, a lambda function, and a method reference.
        OrderManagement orderManagement = new OrderManagement(new DefaultDistanceCalculator());


        orderManagement.setDistanceCalculator(new IDistanceCalculator() {
            @Override
            public double calculateDistance(City city1, City city2) {
                return city1.getLongitude() - city2.getLongitude();
            }
        });


        // Lambda function
        IDistanceCalculator dCalculator = (city1, city2) -> city1.getLongitude() - city2.getLongitude();

        //Prints the results
        System.out.println("Simple lambda function: " + dCalculator.calculateDistance(new City(100, 200.5), new City(300, 400)));




        // Lambda function with multiple lines of code inside the body
        // This is a block lambda function
        IDistanceCalculator dCalculator2 = (city1, city2) -> {
            System.out.println("\nBlock Lambda Function:");
            return city1.getLongitude() - city2.getLongitude();
        };

        //Prints the results
        System.out.println(dCalculator2.calculateDistance(new City(100, 200.5), new City(300, 400)));


        orderManagement.setDistanceCalculator((city1, city2) -> city1.getLongitude() - city2.getLongitude());




        // ========== Method reference demo ==========
        orderManagement.setDistanceCalculator(GoogleDistanceCalculator::getDistanceBetweenCitiesStatic);
        GoogleDistanceCalculator gdc = new GoogleDistanceCalculator();
        orderManagement.setDistanceCalculator(gdc::getDistanceBetweenCities);


    }

}
