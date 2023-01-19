package com.java.academy.week1.day4.dependencyInjection.v4;

public class Intern {

    //Has-a
    String name;
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
