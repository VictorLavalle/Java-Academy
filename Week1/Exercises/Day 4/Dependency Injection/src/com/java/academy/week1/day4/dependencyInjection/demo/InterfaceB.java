package com.java.academy.week1.day4.dependencyInjection.demo;

public interface InterfaceB extends InterfaceA, InterfaceC {

    // This is a method from InterfaceA and InterfaceC that is implemented in InterfaceB class
    void execute();
}
