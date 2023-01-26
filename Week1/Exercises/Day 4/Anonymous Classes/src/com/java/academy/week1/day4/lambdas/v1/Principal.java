package com.java.academy.week1.day4.lambdas.v1;

public class Principal {

    public static void main(String[] args){

        /*
         ***********************************************************************
         */

        // Anonymous class (without name) that implements the interface Operation
        Operation operation1 = new Operation() {
            @Override
            public int execute(int x, int y) {
                return x + y;
            }
        };
        int result1 = operation1.execute(8, 4);
        System.out.println("Sum:\nResult 1: " + result1); // 12


        /*
        ***********************************************************************
         */

        // Anonymous class (without name) that implements the interface Operation
        Operation operation2 = new Operation() {
            @Override
            public int execute(int x, int y) {
                return x - y;
            }
        };

        int result2 = operation2.execute(8, 4);
        System.out.println("Substraction:\nResult 2: " + result2); // 4


        /*
         ***********************************************************************
         */

        // Anonymous class (without name) that implements the interface Operation
        Operation operation3 = new Operation() {
            @Override
            public int execute(int x, int y) {
                return (int)Math.pow(x, y);
            }
        };

        int result3 = operation3.execute(8, 4);
        System.out.println("Pow:\nResult 3: " + result3); // 4096


        /*
         ***********************************************************************
         */

        // Anonymous class (without name) that implements the interface Operation
        // and overrides the toString() method to print the operation name.
        Operation operation4 = new Operation() {
            @Override
            public int execute(int x, int y) {
                return x * y;
            }

            @Override
            public String toString() {
                return "Multiplication:";
            }
        };

        System.out.println(operation4);
        int result4 = operation4.execute(8, 4);
        System.out.println(result4); // 32


    }

}
