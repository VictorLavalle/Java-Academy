package com.java.academy.week2.day4.composite.v2;

public class CompositeMultiplication implements Component {
    private Component left;
    private Component right;
    public CompositeMultiplication(Component left, Component right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double getValue() {
        double res = left.getValue() * right.getValue();
        return res;
    }
}

