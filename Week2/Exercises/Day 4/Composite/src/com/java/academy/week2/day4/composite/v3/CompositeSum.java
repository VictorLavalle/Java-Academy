package com.java.academy.week2.day4.composite.v3;

public class CompositeSum implements Component {

    //HAS-A (composition)
    private Component left;
    private Component right;

    public CompositeSum(Component left, Component right, CompositeSubtraction compositeSubtraction) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue() {
        double res = right.getValue() +
                left.getValue();
        return res;
    }
}
