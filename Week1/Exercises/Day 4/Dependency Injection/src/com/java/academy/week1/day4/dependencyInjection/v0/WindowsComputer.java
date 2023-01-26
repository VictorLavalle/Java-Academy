package com.java.academy.week1.day4.dependencyInjection.v0;

public class WindowsComputer {

        //Has-a
        String name;

        public WindowsComputer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Computadora [name=" + name + "]";
        }

        void turnOn() {
            System.out.println("Turning on computer");
        }

        void turnOff() {
            System.out.println("Turning off computer");
        }
}
