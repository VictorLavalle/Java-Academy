package com.java.academy.week1.day2.polymorphism.v2;

public class Operation {

    int x;
    int y;

    public Operation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int execute() {
        return 0;
    }

    @Override
    public String toString() {
        return "Operation [x=" + x + ", y=" + y + "]";
    }

}
