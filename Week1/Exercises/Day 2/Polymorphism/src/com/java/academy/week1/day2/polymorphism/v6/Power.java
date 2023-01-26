package com.java.academy.week1.day2.polymorphism.v6;

public class Power extends Operation {

    public Power(int x, int y) {
        super(x, y);
    }

    @Override
    int execute() {
        return (int) Math.pow(x, y);
    }

}

