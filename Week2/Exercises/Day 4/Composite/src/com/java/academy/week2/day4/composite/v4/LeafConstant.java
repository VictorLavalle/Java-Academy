package com.java.academy.week2.day4.composite.v4;

public class LeafConstant implements Component {

    private double constValue;

    public LeafConstant(double constValue) {
        this.constValue = constValue;
    }

    @Override
    public double getValue() {
        return constValue;
    }

    @Override
    public String toString() {
        return "LeafConstant [Const Value=" + constValue + "]";
    }
}

