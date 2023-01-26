package com.java.academy.week1.day4.lambdas.v2;

public class PrincipalFunctional {

    public static void main(String[] args) {

        // Lambdas expressions that implements the interface Operation
        // by using the functional interface Operation and the method execute().

        //Sum
        Operation operation1 = (x, y) -> x + y;
        int result1 = operation1.execute(8, 4);
        System.out.println("Sum:\nResult 1: " + result1); // 12
        System.out.println("--------------------");

        //Substraction
        Operation operation2 = (x, y) -> x - y;
        int result2 = operation2.execute(8, 4);
        System.out.println("Substraction:\nResult 2: " + result2); // 4
        System.out.println("--------------------");

        //Pow
        Operation operation3 = (x, y) -> (int)Math.pow(x, y);
        int result3 = operation3.execute(8, 4);
        System.out.println("Pow:\nResult 3: " + result3); // 4096
        System.out.println("--------------------");

    }

}
