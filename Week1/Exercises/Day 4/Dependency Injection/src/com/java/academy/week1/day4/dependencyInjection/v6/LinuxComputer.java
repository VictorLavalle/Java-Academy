package com.java.academy.week1.day4.dependencyInjection.v6;

public class LinuxComputer implements Computer {

    //Has-A
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

