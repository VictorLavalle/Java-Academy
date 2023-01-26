package com.java.academy.week1.day1.encapsulation;

public class Employee {

    //Instance Class variables
    private String name;
    private int age;
    private boolean isSingle;
    private StringBuilder position;

    //Constructor
    public Employee(String name, int age, boolean isSingle, StringBuilder position) {
        this.name = name;
        this.age = age;
        this.isSingle = isSingle;
        this.position = position;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setIsSingle(boolean single) {
        isSingle = single;
    }

    public StringBuilder getPosition() {
        return position;
    }

    public void setPosition(StringBuilder position) {
        this.position = position;
    }

    //toString method
    //This method is used to print the object
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isSingle=" + isSingle +
                ", position=" + position +
                '}';
    }
}
