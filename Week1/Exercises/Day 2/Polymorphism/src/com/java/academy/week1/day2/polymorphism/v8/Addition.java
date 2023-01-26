package com.java.academy.week1.day2.polymorphism.v8;

public class Addition implements Operation {

    int x;
    int y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This is the method that is called when we call the execute() method on an Addition object
    @Override
    public int execute() {
        return x + y;
    }

    @Override
    public String toString() {
        return "Addition [x=" + x + ", y=" + y + "]";
    }
}
