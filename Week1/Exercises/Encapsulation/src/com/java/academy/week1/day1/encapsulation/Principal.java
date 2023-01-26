package com.java.academy.week1.day1.encapsulation;

public class Principal {

        public static void main(String[] args) {

            //Create an object of Employee class
            Employee employee = new Employee("John", -25, false, new StringBuilder("Developer"));

            //employee.age = -25; //This is not allowed, it will throw an exception because age is private
            employee.setAge(-25);  //This is allowed because age is private but we have a setter

            //employee.isSingle = true;//This is not allowed, it will throw an exception because isSingle is private
            employee.setIsSingle(true); //This is allowed because isSingle is private but we have a setter

            //employee.position = new StringBuilder("Manager");
            employee.setPosition(new StringBuilder("Manager"));

            //Print the object
            System.out.println("Method toString():\n" + employee);

            System.out.println("\n--------------------\n");

            //Print the object using getters
            System.out.println("Method getters:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Is Single: " + employee.isSingle());
            System.out.println("Position: " + employee.getPosition());


        }
}
