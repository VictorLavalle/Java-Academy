package com.java.academy.week1.day2.polymorphism.v5;

public class Power extends Operation {

    public Power(int x, int y) {
        super(x, y);
    }

    @Override
    int execute() {
        return (int) Math.pow(x, y);
    }

    @Override
    public String toString() {
        return "Power [x=" + x + ", y=" + y + "]";
    }
}

