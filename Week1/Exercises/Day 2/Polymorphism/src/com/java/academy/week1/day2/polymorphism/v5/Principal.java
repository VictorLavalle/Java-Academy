package com.java.academy.week1.day2.polymorphism.v5;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        ArrayList<Operation> operations = new ArrayList<>();

        operations.add(new Addition(1, 2));
        operations.add(new Substraction(1, 2));
        operations.add(new Multiplication(1, 2));
        operations.add(new Division(1, 2));
        operations.add(new Power(1, 2));


        
        printOperations(operations);
    }

    // Polymorphism
    static void printOperations(ArrayList<Operation> operations) {
        for (Operation operation : operations) {
            System.out.println(operation);
            System.out.println(operation.execute());
        }
    }
}
