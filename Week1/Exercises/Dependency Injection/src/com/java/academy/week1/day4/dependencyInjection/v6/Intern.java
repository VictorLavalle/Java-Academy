package com.java.academy.week1.day4.dependencyInjection.v6;

public class Intern {

    //Has-a
    String name;

    //Don't call me, I'll call you --> Fulfiled
    //Low coupling
    //An External agent must inject the object to the reference variable
    private Computer computer;

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

    public Computer getComputer() {
        return computer;
    }

    void setComputer(Computer computer) {
        this.computer = computer;
    }

}
