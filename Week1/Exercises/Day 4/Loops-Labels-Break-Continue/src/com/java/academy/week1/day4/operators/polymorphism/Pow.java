package com.java.academy.week1.day4.operators.polymorphism;

public class Pow extends OperationAbstract {

    public Pow(int x, int y) {
        super(x, y);
    }

    @Override
    public int execute() {
        return (int) Math.pow(x, y);
    }

}

