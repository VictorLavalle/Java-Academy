package com.java.academy.week2.day2.exceptions.v7;

public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero

        int x = 101;
        int y = 2;
        int result = 0;


        // We can catch multiple exceptions in a single catch block
        try {
            result = calculateDivision(x, y);
        } catch (CeroException | NegativeException | UnsupportedOperationException e) {
            e.printStackTrace();
        }


        System.out.println(result);
        System.out.println("Program successfully finished");
    }


    // We can throw multiple exceptions in a method declaration
    // Just separate them with a comma
    private static int calculateDivision(int x, int y) throws CeroException, NegativeException {
        if (y == 0) {
            throw new CeroException("Division by zero is not allowed");
        }
        if (y < 0) {
            throw new NegativeException("Division by negative number is not allowed");
        }
        if (x > 100) {
            throw new UnsupportedOperationException("x no puede ser mayor a 100");
        }
        return x / y;
    }

}
