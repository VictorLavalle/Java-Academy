package com.java.academy.week1.day4.operators.polymorphism;

public abstract class OperationAbstract implements Operation {

    int x;
    int y;

    public OperationAbstract(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "[x=" + x + ", y=" + y + "]";
    }

}
