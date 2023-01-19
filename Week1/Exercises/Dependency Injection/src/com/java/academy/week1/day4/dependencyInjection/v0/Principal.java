package com.java.academy.week1.day4.dependencyInjection.v0;

public class Principal {

    public static void main(String[] args) {

        // This will print a null pointer exception because the computer is not initialized:
        // Intern intern = new Intern("John");
        // intern.turnOnComputer();

        Intern intern = new Intern("John");
        intern.turnOnComputer();

    }

}
