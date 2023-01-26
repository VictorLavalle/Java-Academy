package com.java.academy.week1.day4.operators.polymorphism;

public class Division extends OperationAbstract {

    public Division(int x, int y) {
        super(x, y);
    }

    @Override
    public int execute() {
        return x/y;
    }

}
