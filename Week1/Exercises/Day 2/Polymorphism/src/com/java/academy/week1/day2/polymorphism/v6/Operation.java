package com.java.academy.week1.day2.polymorphism.v6;

public abstract class Operation {

    int x;
    int y;

    public Operation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int execute();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + x + ", " + y + "]";
    }
}
