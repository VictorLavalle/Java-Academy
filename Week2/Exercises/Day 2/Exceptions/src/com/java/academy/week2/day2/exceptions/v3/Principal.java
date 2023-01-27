package com.java.academy.week2.day2.exceptions.v3;

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
            System.out.println("Can't divide by zero.");
        } finally {
            System.out.println("This line will always be executed"); //This line will always be executed even if there is an exception
        }


        System.out.println(result);
        System.out.println("Program successfully finished");
    }

    // This method will throw an exception if y is zero
    private static int calculateDivision(int x, int y) {
        return x / y;
    }

}
