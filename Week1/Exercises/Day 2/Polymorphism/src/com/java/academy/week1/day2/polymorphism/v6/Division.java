package com.java.academy.week1.day2.polymorphism.v6;

public class Division extends Operation {

    public Division(int x, int y) {
        super(x, y);
    }

    @Override
    int execute() {
        return x / y;
    }

}
