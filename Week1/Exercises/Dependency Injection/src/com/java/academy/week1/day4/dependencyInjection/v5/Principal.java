package com.java.academy.week1.day4.dependencyInjection.v5;

public class Principal {

    public static void main(String[] args) {

        Intern intern = new Injector.injectPC("John", "Linux");
        intern.turnOnComputer();

        Intern intern2 = new Injector.injectPC("John", "Windows");
        intern2.turnOnComputer();

    }

}
