package com.java.academy.week2.day2.exceptions.v3;

public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero

        int x = 5;
        int y = 0;
        int result = 0;


        //Implementation of the try-catch block
        //try {
        //    result = calculateDivision(x, y);
        //  } catch (CeroException e) {
        //      e.printStackTrace();
        //  }

        System.out.println(result);
        System.out.println("Program successfully finished");
    }

    // This method will throw an exception if y is zero
    // The exception is thrown using the keyword "throws" and the name of the exception
    // Doing this, the method will not handle the exception, but will throw it to the caller,
    // it will be responsible for handling the exception (try-catch block).
    // This way of handling exceptions is called "propagation"
    private static int calculateDivision(int x, int y) throws CeroException {
        if (y == 0) {
            throw new CeroException("Division by zero is not allowed");
        }
        return x / y;
    }

}
