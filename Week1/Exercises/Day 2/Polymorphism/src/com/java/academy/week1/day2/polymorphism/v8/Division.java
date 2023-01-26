package com.java.academy.week1.day2.polymorphism.v8;

public class Division implements Operation {

    int x;
    int y;

    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int execute() {
        return x / y;
    }

    @Override
    public String toString() {
        return "Division [x=" + x + ", y=" + y + "]";
    }

}
