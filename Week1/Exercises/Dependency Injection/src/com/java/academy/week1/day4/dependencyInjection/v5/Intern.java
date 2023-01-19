package com.java.academy.week1.day4.dependencyInjection.v5;

public class Intern {

    //Has-a
    String name;
    private Computer computer;

    public Intern(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
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
