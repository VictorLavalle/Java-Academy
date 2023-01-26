package com.java.academy.week1.day2.polymorphism.finalVersion;

public class Substraction extends OperationAbstract {

    public Substraction(int x, int y) {
        super(x, y);
    }

    @Override
    public int execute() {
        return x-y;
    }

}
