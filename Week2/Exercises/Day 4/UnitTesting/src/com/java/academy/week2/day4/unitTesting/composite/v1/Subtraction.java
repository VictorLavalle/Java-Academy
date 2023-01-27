package com.java.academy.week2.day4.unitTesting.composite.v1;

public class Subtraction extends AbstractExpression {

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }

}

