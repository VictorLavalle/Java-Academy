package com.java.academy.week1.day2.polymorphism.v6;

public class Multiplication extends Operation {

    public Multiplication(int x, int y) {
        super(x, y);
    }

    @Override
    int execute() {
        return x * y;
    }

}
