package com.java.academy.week2.day4.composite.v5;

public class CompositeSubtraction extends AbstractComponent {
    public CompositeSubtraction(Component left, Component right) {
        super(left, right);
    }
    @Override
    public double getValue() {
        double res = left.getValue() - right.getValue();
        return res;
    }
}

