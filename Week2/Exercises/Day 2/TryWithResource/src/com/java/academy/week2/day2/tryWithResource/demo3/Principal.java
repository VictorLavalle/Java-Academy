package com.java.academy.week2.day2.tryWithResource.demo3;

public class Principal {

    public static void main(String[] args) {

        Duck duck = null;
        try {
            duck = new Duck(); // Pato is closing
        } finally {
            try {
                duck.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Pass through Finally");
        }
    }

}
