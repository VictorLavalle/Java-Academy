package com.java.academy.week1.day4.dependencyInjection.v5;

public class Principal {

    public static void main(String[] args) {

        Intern intern = Injector.injectPc("John", "Linux");
        intern.turnOnComputer();

        Intern intern2 = Injector.injectPc("John2", "Windows");
        intern2.turnOnComputer();

        Intern intern3 = Injector.injectPc("John3", "Apple");
        intern3.turnOnComputer();

    }

}
