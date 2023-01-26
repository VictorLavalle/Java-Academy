package com.java.academy.week1.day4.operators.polymorphism;

public class Sum extends OperationAbstract {

    public Sum(int x, int y) {
        super(x, y);
    }

    @Override
    public int execute() {
        return x+y;
    }

}
