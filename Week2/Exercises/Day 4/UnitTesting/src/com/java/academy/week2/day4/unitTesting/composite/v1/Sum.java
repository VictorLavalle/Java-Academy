package com.java.academy.week2.day4.unitTesting.composite.v1;

public class Sum extends AbstractExpression {
    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }

}
