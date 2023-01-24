package com.java.academy.week1.day4.dependencyInjection.v5;

public class WindowsComputer extends Computer {

    String version;

    public WindowsComputer(String version) {
        this.version = version;
    }

    public void turnOn() {
        System.out.println("Turning on Windows " + version + " computer");
    }

    public void turnOff() {
        System.out.println("Turning off Windows " + version + " computer");
    }

}

