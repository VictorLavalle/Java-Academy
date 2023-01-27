package com.java.academy.week2.day2.exceptions.v1;

public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero

        int x = 5;
        int y = 0;
        int result = 0;


        //Implementation of the try-catch block
        try {
            result = calculateDivision(x, y); //Do the division and store the result in the variable result
        } catch (ArithmeticException e) { //Throw an exception if y is zero
            System.out.println("Can't divide by zero. \n Exception: " + e.getMessage());
        } catch (Exception e) {//Throw an exception if there is any other problem
            System.out.println("Please, check your input data. \n Exception: " + e.getMessage());
        }


        System.out.println(result); // This line will be executed if there is no exception thrown by the method
        System.out.println("Program successfully finished");
    }

    // This method will throw an exception if y is zero
    private static int calculateDivision(int x, int y) {
        return x / y;
    }

}
