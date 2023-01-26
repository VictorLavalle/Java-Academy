package com.java.academy.week1.day2.polymorphism.v6;

//CANNOT CREATE OBJECTS FROM THIS CLASS BECAUSE IT IS ABSTRACT
public abstract class Operation {

    int x;
    int y;

    public Operation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //METHOD WITHOUT BODY (BEHAVIOR)
    //THE CHILDREN MUST WILL IMPLEMENT THIS METHOD WITH THEIR OWN BEHAVIOR (BODY)
    abstract int execute();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + x + ", " + y + "]";
    }
}
