package com.java.academy.unit.testing.v1;

public class Sum {

    CloudSum cloudSum;

    int x;
    int y;

    public Sum(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int execute() {
        return cloudSum.executeSum(x, y);
    }
}
