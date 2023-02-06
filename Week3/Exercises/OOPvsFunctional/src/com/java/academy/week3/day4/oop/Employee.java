package com.java.academy.week3.day4.oop;

public class Employee {

    private int employeeNumber;
    private String name;
    private double salary;

    public Employee(int employeeNumber, String name, double salary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
