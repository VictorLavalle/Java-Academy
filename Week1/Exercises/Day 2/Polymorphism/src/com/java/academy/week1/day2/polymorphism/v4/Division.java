package com.java.academy.week1.day2.polymorphism.v4;

public class Division extends Operation {

    public Division(int x, int y) {
        super(x, y);
    }

    int execute() {
        return x / y;
    }

    @Override
    public String toString() {
        return "Division [x=" + x + ", y=" + y + "]";
    }

}
