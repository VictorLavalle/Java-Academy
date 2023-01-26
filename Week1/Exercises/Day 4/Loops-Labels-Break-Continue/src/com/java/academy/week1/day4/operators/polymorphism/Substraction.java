package com.java.academy.week1.day4.operators.polymorphism;

public class Substraction extends OperationAbstract {

    public Substraction(int x, int y) {
        super(x, y);
    }

    @Override
    public int execute() {
        return x-y;
    }

}
