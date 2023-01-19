package com.java.academy.week1.day4.dependencyInjection.v5;

public class Injector {

    static Computer linuxComputer = new LinuxComputer("Ubuntu");
    static Computer windowsComputer = new WindowsComputer("Windows 10");

    static Intern injectPC(String internName, String os) {

        if (os.equals("Linux")) {
            return new Intern(internName, linuxComputer);
        } else if (os.equals("Windows")) {
            return new Intern(internName, windowsComputer);
        }

    }
}
