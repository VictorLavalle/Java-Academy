package com.java.academy.week1.day2.polymorphism.v0;

public class Addition {

    int x;
    int y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int execute() {
        return x + y;
    }

    @Override
    public String toString() {
        return "Addition [x=" + x + ", y=" + y + "]";
    }
}
