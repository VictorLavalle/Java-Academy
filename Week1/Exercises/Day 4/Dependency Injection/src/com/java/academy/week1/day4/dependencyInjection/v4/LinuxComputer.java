package com.java.academy.week1.day4.dependencyInjection.v4;

public class LinuxComputer extends Computer {

    //Has-A
    String version;

    public LinuxComputer(String version) {
        this.version = version;
    }

    void turnOn() {
        System.out.println("Turning on Linux " + version + " computer");
    }

    void turnOff() {
        System.out.println("Turning off Linux " + version + " computer");
    }

}

