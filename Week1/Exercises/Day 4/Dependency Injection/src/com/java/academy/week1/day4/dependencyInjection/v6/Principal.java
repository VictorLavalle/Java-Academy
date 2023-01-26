package com.java.academy.week1.day4.dependencyInjection.v6;

public class Principal {

    public static void main(String[] args) {

        Intern intern = new Intern("John");
        Injector.injectPC(intern,"Linux");
        intern.turnOnComputer();

        System.out.println("------------------");

        Intern intern2 = new Intern("Doe");
        Injector.injectPC(intern2,"Windows");
        intern2.turnOnComputer();

    }

}
