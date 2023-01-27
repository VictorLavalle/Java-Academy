package com.java.academy.week2.day4.unitTesting.composite.v1;

public class Multiplication extends AbstractExpression {

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }

}
