package com.java.academy.week1.day4.dependencyInjection.v3;

public class Injector {

    static Computer linuxComputer = new LinuxComputer("Ubuntu");
    static Computer windowsComputer = new WindowsComputer("Windows 10");

    static void injectPC(Intern intern, String os) {

        if (os.equals("Linux")) {
            intern.computer = linuxComputer;
        } else if (os.equals("Windows")) {
            intern.computer = windowsComputer;
        }

    }
}
