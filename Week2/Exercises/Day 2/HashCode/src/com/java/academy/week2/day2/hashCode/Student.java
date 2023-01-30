package com.java.academy.week2.day2.hashCode;

import java.util.Objects;

//POJO (PLAIN OLD JAVA OBJECT)
public class Student {

    // Attributes
    private String name;

    private int age;

    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and Setters
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //The hashCode() method is used to get the hash code value of the object.
    //The hash code of an object is an integer.
    //This integer value is used to determine the index of the object in the hash table.
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    //The equals() method is used to compare two objects.
    //The equals() method compares the original content of the object.
    //If the content of both the objects is same, then the equals() method returns true.
    //Otherwise, it returns false.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        if (age != student.age) return false;
        if (Double.compare(student.grade, grade) != 0) return false;
        return Objects.equals(name, student.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
