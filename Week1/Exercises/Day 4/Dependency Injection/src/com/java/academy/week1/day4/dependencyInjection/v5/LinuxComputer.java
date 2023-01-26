package com.java.academy.week1.day4.dependencyInjection.v5;

public class LinuxComputer extends Computer {

    String version;

    public LinuxComputer(String version) {
        this.version = version;
    }

    public void turnOn() {
        System.out.println("Turning on Linux " + version + " computer");
    }

    public void turnOff() {
        System.out.println("Turning off Linux " + version + " computer");
    }

}

