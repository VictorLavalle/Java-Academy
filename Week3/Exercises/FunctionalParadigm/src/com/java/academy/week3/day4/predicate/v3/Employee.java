package com.java.academy.week3.day4.predicate.v3;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

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
    public int compareTo(Employee other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber == employee.employeeNumber && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, name, salary);
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
