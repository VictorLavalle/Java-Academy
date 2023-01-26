package com.java.academy.week1.day4.dependencyInjection.v1;

public class WindowsComputer {

        //Has-a
        String name;

        public WindowsComputer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Computer [name=" + name + "]";
        }

        void turnOn() {
            System.out.println("Turning on Windows computer");
        }

        void turnOff() {
            System.out.println("Turning off Windows computer");
        }
}
