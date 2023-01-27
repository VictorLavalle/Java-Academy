package com.java.academy.week2.day4.composite.v5;

public abstract class AbstractComponent implements Component {

    //HAS-A (composition)
    Component left;
    Component right;

    public AbstractComponent(Component left, Component right) {
        this.left = left;
        this.right = right;
    }
}
