package com.java.academy.week2.day4.unitTesting.composite.v1;

public abstract class AbstractExpression implements Expression{
    Expression left, right;

    public AbstractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
