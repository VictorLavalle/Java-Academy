package com.java.academy.week2.day2.tryWithResource.demo3;

public class Duck implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Pato is closing");
    }

    @Override
    public String toString() {
        return "Duck []";
    }

}

