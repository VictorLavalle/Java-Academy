package com.java.academy.week1.day4.lambdas.v0;

public class Sum implements Operation {

    @Override
    public int execute(int x, int y) {
        return x + y;
    }

    @Override
    public String toString() {
        return "Sum[]";
    }

}
