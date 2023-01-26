package com.java.academy.week1.day2.polymorphism.v1;

public class Principal {

    public static void main(String[] args) {

        Operation operation1 = new Addition(2, 3);
        Operation operation2 = new Substraction(2, 3);

        System.out.println(operation1);
        System.out.println(operation2.execute()); // 5

        System.out.println(operation1);
        System.out.println(operation2.execute()); // -1

    }
}
