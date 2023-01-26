package com.java.academy.week1.day4.dependencyInjection.v2;

public class Intern {

    //Has-a
    String name;

    // Hollywood principle
    // Don't call us, we'll call you
    // This has a low coupling
    // An external agent needs to inject the object to the reference
    Computer computer;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Intern [name=" + name + "]";
    }

    void turnOnComputer() {
        System.out.println(name);
        computer.turnOn();
    }

    void turnOffComputer() {
        System.out.println(name);
        computer.turnOff();
    }

}
