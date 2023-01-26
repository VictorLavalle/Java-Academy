package com.java.academy.week1.day2.accessModifiers.v0;

import java.util.Objects;

public class Student {

    //Note: Until Java 8
    //public ---> Everywhere
    //protected ---> Same Package + Subclasses
    //default ---> Same Package (no modifier) and it doesn't need to be declared
    //private ---> Just in the same class

    protected String name;
    protected int age;
    StringBuilder id;
    boolean isLegalAge;

    //Constructor
    public Student(String name, int age, StringBuilder id, boolean isLegalAge) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isLegalAge = isLegalAge; //Note: this is not a good practice. Also you can validate this way: this.isLegalAge = age >= 18;
    }

    //Methods (getters and setters)

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

    public StringBuilder getId() {
        return id;
    }

    public void setId(StringBuilder id) {
        this.id = id;
    }

    public boolean isLegalAge() {
        return isLegalAge;
    }

    public void setIsLegalAge(boolean legalAge) {
        isLegalAge = legalAge;
    }

    //Other methods
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", isLegalAge=" + isLegalAge +
                '}';
    }

    // This is short example to compare two objects by name field only
    @Override
    public boolean equals(Object o){
        Student other = (Student) o;
        return Objects.equals(name, other.name);
    }
}
