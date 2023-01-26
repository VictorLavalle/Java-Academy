package com.java.academy.week1.day2.polymorphism.v2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Addition operation1 = new Addition(2, 3);
        Substraction operation2 = new Substraction(2, 3);

        ArrayList<Operation> operations = new ArrayList<>();

        operations.add(operation1);
        operations.add(operation2);

        printOperations(operations);
    }

    // This method is not polymorphic, because it only accepts ArrayList<Operation> as parameter.
    // If we want to make it polymorphic, we need to change the parameter type to ArrayList<? extends Operation>
    // or ArrayList<? super Operation>
    static void printOperations(ArrayList<Operation> operations) {
        for (Operation operation : operations) {
            System.out.println(operation);
            System.out.println(operation.execute());
        }
    }
}
