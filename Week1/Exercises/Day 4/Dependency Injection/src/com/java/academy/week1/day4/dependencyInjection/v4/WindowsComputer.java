package com.java.academy.week1.day4.dependencyInjection.v4;

public class WindowsComputer extends Computer {

    //Has-A
    String version;

    public WindowsComputer(String version) {
        this.version = version;
    }

    @Override
    void turnOn() {
        System.out.println("Turning on Windows " + version + " computer");
    }

    @Override
    void turnOff() {
        System.out.println("Turning off Windows " + version + " computer");
    }

}

