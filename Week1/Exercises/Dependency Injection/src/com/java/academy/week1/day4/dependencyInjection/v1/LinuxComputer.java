package com.java.academy.week1.day4.dependencyInjection.v1;

public class LinuxComputer {

        //Has-a
        String name;

        public LinuxComputer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Computer [name=" + name + "]";
        }

        void turnOn() {
            System.out.println("Turning on  Linux computer");
        }

        void turnOff() {
            System.out.println("Turning off Linux computer");
        }
}
