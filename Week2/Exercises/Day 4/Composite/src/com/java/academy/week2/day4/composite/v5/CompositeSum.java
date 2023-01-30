package com.java.academy.week2.day4.composite.v5;

public class CompositeSum extends AbstractComponent {

    public CompositeSum(Component left, Component right, CompositeSubtraction compositeSubtraction) {
        super(left, right);
    }

    @Override
    public double getValue() {
        double res = right.getValue() +
                left.getValue();
        return res;
    }
}
