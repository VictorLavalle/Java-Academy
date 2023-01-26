package com.java.academy.week1.day2.polymorphism.v5;

public class Multiplication extends Operation {

    public Multiplication(int x, int y) {
        super(x, y);
    }

    @Override
    int execute() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Power [x=" + x + ", y=" + y + "]";
    }
}
