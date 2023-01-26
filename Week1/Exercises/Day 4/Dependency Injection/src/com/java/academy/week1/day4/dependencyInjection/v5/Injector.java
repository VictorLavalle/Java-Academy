package com.java.academy.week1.day4.dependencyInjection.v5;

//Usually we use interfaces to inject dependencies --> this is what frameworks do
public class Injector {

    static Intern injectPc(String name, String os){

        if (os.equals("Linux")) {
            return new Intern(name, new LinuxComputer("Ubuntu"));
        }

        if (os.equals("Apple")) {
            return new Intern(name, new AppleComputer("MacOS"));
        } else {
            return new Intern(name, new WindowsComputer("Windows"));
        }
    }
}

