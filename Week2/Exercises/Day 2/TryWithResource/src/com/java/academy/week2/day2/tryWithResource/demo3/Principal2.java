package com.java.academy.week2.day2.tryWithResource.demo3;

public class Principal2 {

    public static void main(String[] args) {

        try (Duck duck = new Duck()) { // Noe that we are using the try-with-resource- duck is a resource
            System.out.println(duck); // duck is an object
        } catch (Exception e) {
            e.printStackTrace();
        }

        // The duck is closed automatically
        System.out.println("The duck is closed automatically");
    }

    private static void getExcepcion() throws Exception {
        throw new Exception("Exception generated");
    }

}
