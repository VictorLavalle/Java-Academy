package com.java.academy.week2.day4.composite.v4;

public class CompositeSubtraction implements Component {

    //HAS-A (composition)
    private Component left;
    private Component right;
    public CompositeSubtraction(Component left, Component right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double getValue() {
        double res = left.getValue() - right.getValue();
        return res;
    }
}

