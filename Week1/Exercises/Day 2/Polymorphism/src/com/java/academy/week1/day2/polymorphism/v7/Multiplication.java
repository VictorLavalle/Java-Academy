package com.java.academy.week1.day2.polymorphism.v7;

public class Multiplication implements Operation {

    int x;
    int y;

    public Multiplication(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int execute() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Power [x=" + x + ", y=" + y + "]";
    }
}
