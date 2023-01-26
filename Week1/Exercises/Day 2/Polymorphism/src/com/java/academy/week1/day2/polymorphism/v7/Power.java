package com.java.academy.week1.day2.polymorphism.v7;

public class Power implements Operation {

    int x;
    int y;

    public Power(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int execute() {
        return (int) Math.pow(x, y);
    }

    @Override
    public String toString() {
        return "Power [x=" + x + ", y=" + y + "]";
    }
}

