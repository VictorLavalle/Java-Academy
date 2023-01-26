package com.java.academy.week1.day4.dependencyInjection.v1;

public class Intern {

    //Has-a
    String name;
    //WindowsComputer windowsComputer;
    //This has a high coupling with WindowsComputer
    WindowsComputer windowsComputer = new WindowsComputer("Vista");
    LinuxComputer linuxComputer = new LinuxComputer("Ubuntu");

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Intern [name=" + name + "]";
    }

    void turnOnComputer(String typeOfComputer) {
        System.out.println(name);
        if (typeOfComputer.equals("Windows")) {
            windowsComputer.turnOn();
        } else if (typeOfComputer.equals("Linux")) {
            linuxComputer.turnOn();
        }
    }

    void turnOffComputer(String typeOfComputer) {
        System.out.println(name);
        if (typeOfComputer.equals("Windows")) {
            windowsComputer.turnOff();
        } else if (typeOfComputer.equals("Linux")) {
            linuxComputer.turnOff();
        }
    }

}
