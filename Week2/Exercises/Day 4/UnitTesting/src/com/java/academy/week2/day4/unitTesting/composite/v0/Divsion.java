package com.java.academy.week2.day4.unitTesting.composite.v0;

public class Divsion extends Expression {
    private Expression left;
    private Expression right;

    public Divsion(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected double getValue() {
        double res = left.getValue() / right.getValue();
        return res;
    }

}
