package com.java.academy.week2.day4.unitTesting.composite.v1;

public class Constant implements Expression {
    double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

}
