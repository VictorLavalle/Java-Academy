package com.java.academy.week1.day4.dependencyInjection.v6;

public class WindowsComputer implements Computer {

    //Has-A
    String version;

    public WindowsComputer(String version) {
        this.version = version;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Windows " + version + " computer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Windows " + version + " computer");
    }

}

