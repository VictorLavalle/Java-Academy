package com.java.academy.week2.day4.unitTesting.composite.v0;

public class Sum extends Expression {
    private Expression left;
    private Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected double getValue() {
        double res = left.getValue() + right.getValue();
        return res;
    }

}
