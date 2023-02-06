package com.java.academy.week3.day4.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    private static final Employee[] arrayOfEmployees = {
            new Employee(0, "Patrobas", 100.0),
            new Employee(1, "Tercio", 200.0),
            new Employee(2, "Andrónico", 300.0),
            new Employee(3, "Epeneto", 400.0),
            new Employee(4, "Filologo", 500.0),
    };


    public static void main(String[] args) {

        List<Employee> listOfEmployees = Arrays.asList(arrayOfEmployees);


        //Filter: Salary < 400
        List<Employee> filteredList = filterBySalary(listOfEmployees);
        System.out.println("\nEmployees with salary below 400:");
        for (Employee employee : filteredList) {
            System.out.println(employee.getName());
        }


        //Add salary in 200
        addSalary(listOfEmployees, 200);
        System.out.println("\nEmployees with added salary of 200:");
        for (Employee employee : listOfEmployees) {
            System.out.println( employee.getName() + ": " +
                                employee.getSalary() +
                                "- Previous salary: " + (employee.getSalary() - 200));
        }


        //Filter: name longer than 6 characters
        System.out.println("\nEmployees with name longer than 6 characters:");
        List<Employee> filteredListByName = filterByName(listOfEmployees, 6);
        for (Employee employee : filteredListByName) {
            System.out.println(employee.getName());
        }



        //Order by name
        List<Employee> orderedEmployees = sortEmployeesByName(filteredListByName);
        System.out.println("\nEmployees ordered by name:");
        for (Employee employee : orderedEmployees) {
            System.out.println(employee.getName());
        }

    }


    //Method to filter employees by salary < 400
    private static List<Employee> filterBySalary(List<Employee> listOfEmployees) {
        List<Employee> employeesFiltered = new ArrayList<>();
        for (Employee employee : listOfEmployees) {
            if (employee.getSalary() < 400) {
                employeesFiltered.add(employee);
            }
        }
        return employeesFiltered;
    }


    //Method to add 200 to salary
    private static void addSalary(List<Employee> employees, double amount) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + amount);
        }
    }


    //Method to filter employees by name longer than 6 characters
    private static List<Employee> filterByName(List<Employee> listOfEmployees, int nameLength) {
        List<Employee> employeesFilteredByName = new ArrayList<>();
        for (Employee employee : listOfEmployees) {
            if (employee.getName().length() > nameLength) {
                employeesFilteredByName.add(employee);
            }
        }
        return employeesFilteredByName;
    }


    //Method to sort employees by name
    private static List<Employee> sortEmployeesByName(List<Employee> employees) {
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getName().compareTo(employees.get(j).getName()) > 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
        return employees;
    }

}