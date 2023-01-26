package com.java.academy.week1.day4.operators.polymorphism;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Operation> operationArrayList = new ArrayList<>();

        operationArrayList.add(new Sum(2, 3));
        operationArrayList.add(new Substraction(2, 3));
        operationArrayList.add(new Pow(2, 3));
        operationArrayList.add(new Multipication(2, 3));
        operationArrayList.add(new Division(2, 3));
        System.out.println("Interface  with class abstract");
        show(operationArrayList);

    }

    static void show(ArrayList<Operation> lista) {
        for (Operation ope:lista) { //forEach
            System.out.println(ope);
            System.out.println(ope.execute());
        }
    }
}


