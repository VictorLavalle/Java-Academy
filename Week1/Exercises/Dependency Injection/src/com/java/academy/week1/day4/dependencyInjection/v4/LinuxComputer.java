package com.java.academy.week1.day4.dependencyInjection.v4;

public class LinuxComputer extends Computer {

    String version;

    public LinuxComputer(String version) {
        this.version = version;
    }


    @Override
    void turnOn() {
        System.out.println("Turning on Linux " + version + " computer");
    }

    @Override
    void turnOff() {
        System.out.println("Turning off Linux " + version + " computer");
    }

}

