package com.java.academy.week2.day4.unitTesting.composite.v0;

public class Constant extends Expression {
    double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    protected double getValue() {
        return value;
    }

}
