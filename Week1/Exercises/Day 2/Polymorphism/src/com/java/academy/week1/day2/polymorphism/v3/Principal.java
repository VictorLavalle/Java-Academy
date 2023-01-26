package com.java.academy.week1.day2.polymorphism.v3;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Operation operation0 = new Operation(2, 3);
        Addition operation1 = new Addition(2, 3);
        Substraction operation2 = new Substraction(2, 3);
        Division operation3 = new Division(2, 3);

        ArrayList<Operation> operations = new ArrayList<>();

        operations.add(operation0);
        operations.add(operation1);
        operations.add(operation2);
        operations.add(operation3);

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
