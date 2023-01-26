package com.java.academy.week1.day2.polymorphism.v1;

public class Substraction extends Operation{

    public Substraction(int x, int y) {
        super(x, y);
    }

    int execute() {
        return x - y;
    }

    @Override
    public String toString() {
        return "Substraction [x=" + x + ", y=" + y + "]";
    }


}
