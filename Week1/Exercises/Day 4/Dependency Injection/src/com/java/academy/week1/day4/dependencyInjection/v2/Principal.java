package com.java.academy.week1.day4.dependencyInjection.v2;

public class Principal {

    public static void main(String[] args) {


        Intern intern = new Intern("John");
        Computer linuxComputer = new LinuxComputer("Ubuntu");
        intern.computer = linuxComputer;
        intern.turnOnComputer();

        Intern intern2 = new Intern("Juan");
        Computer windowsComputer = new WindowsComputer("Vista");
        intern2.computer = windowsComputer;
        intern2.turnOnComputer();

    }

}
