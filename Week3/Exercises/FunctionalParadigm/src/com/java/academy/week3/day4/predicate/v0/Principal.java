package com.java.academy.week3.day4.predicate.v0;

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

        Predicate p;

//		p = new Predicado() {
//			@Override
//			public boolean test(Employee e) {
//				return e.getSalary()>250;
//			}
//		};

        //DEFINICION DE UNA LAMBADA
        p = e -> e.getSalary() > 250;

        for (Employee emp : listOfEmployees) {
            //LA LAMBADA SE EJECUTA CUANDO LLAMAMOS
            //AL METODO ABSTRACTO
            if (p.test(emp)) {
                System.out.println(emp);
            }
        }

        System.out.println("----------------");

        p = e -> e.getName().length() > 6;

        for (Employee emp : listOfEmployees) {
            if (p.test(emp)) {
                System.out.println(emp);
            }
        }

        System.out.println("----------------");

        p = e -> e.getName().length() > 7 && e.getSalary() > 250;

        for (Employee emp : listOfEmployees) {
            if (p.test(emp)) {
                System.out.println(emp);
            }
        }

    }


}



