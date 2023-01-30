package com.java.academy.week2.day4.composite.v0;

public class LeafConstant implements Component {

    private double value;

    public LeafConstant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

