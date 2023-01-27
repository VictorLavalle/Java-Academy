package com.java.academy.week2.day2.exceptions.v5.v4;

public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero

        int x = 5;
        int y = 0;
        int result = 0;


        try {
            result = calculateDivision(x, y);
        } catch (CeroException e) {
            e.printStackTrace();
        } catch (NegativeException e) {
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
        return x / y;
    }

}
