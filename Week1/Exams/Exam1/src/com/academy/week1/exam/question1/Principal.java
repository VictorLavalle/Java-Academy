package com.academy.week1.exam.question1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){

        // Create an ArrayList of Superhero objects
        ArrayList<Superhero> superheroes = new ArrayList<>();

        // Add Batman and Superman to the ArrayList
        superheroes.add(new Superman("Superman", "Super Strength" , 10));
        superheroes.add(new Batman("Batman", "Money", 7));

        //Call the method printSuperheroes to print the superheroes created above
        printSuperheroes(superheroes);
    }

    // This method should print the name, superpower and secret identity of each superhero in the ArrayList
    static void printSuperheroes(ArrayList<Superhero> superheroes){
        for (Superhero superhero : superheroes) {
            System.out.println("-----------------------");
            System.out.println("Name: " + superhero.getName());
            System.out.println("Superpower: " + superhero.getSuperpower());
            System.out.println("Power: " + superhero.calculatePower());
            System.out.println("Secret identity: " + superhero.getSecretIdentity());
            System.out.println("-----------------------\n");


        }
    }
}
