package com.java.academy.week1.day2.polymorphism.v0;

public class Substraction {

    int x;
    int y;

    public Substraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int execute() {
        return x - y;
    }

    @Override
    public String toString() {
        return "Substraction [x=" + x + ", y=" + y + "]";
    }


}
