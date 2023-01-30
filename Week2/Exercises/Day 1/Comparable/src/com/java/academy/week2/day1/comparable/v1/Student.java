package com.java.academy.week2.day1.comparable.v1;
public class Student {

    private String name;
    private int age;
    private double average;

public Student(String name, int age, double average) {
        this.name = name;
        this.age = age;
        this.average = average;
    }

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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", average=" + average + "]";
    }
}
