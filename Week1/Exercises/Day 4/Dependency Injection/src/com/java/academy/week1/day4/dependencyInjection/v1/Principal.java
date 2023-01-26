package com.java.academy.week1.day4.dependencyInjection.v1;

public class Principal {

    public static void main(String[] args) {

        // This will print a null pointer exception because the computer is not initialized:
        // Intern intern = new Intern("John");
        // intern.turnOnComputer();

        Intern intern = new Intern("John");
        intern.turnOnComputer("Windows");

        Intern intern2 = new Intern("Doe");
        intern2.turnOnComputer("Linux");

    }

}
