package com.java.academy.week2.day2.exceptions.v0;

public class Principal {

    public static void main(String[] args) {

        // A classic example of a division by zero

        int x = 5;
        int y = 0;
        int result = 0;

        result = calculateDivision(x,y); // Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(result); // This line will never be executed

        System.out.println("Program successfully finished");
    }

    // This method will throw an exception if y is zero
    private static int calculateDivision(int x, int y) {
        return x/y;
    }

}
