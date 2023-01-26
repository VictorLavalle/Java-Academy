package com.java.academy.week1.day2.polymorphism.zoo;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
       		/*
		Cat cat = new Cat();
		cat.makeSound();

		Dog dog = new Dog();
		dog.makeSound();*/

        Animal animal = new Cat();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();

        animal = new Duck();
        animal.makeSound();

        System.out.println("---------\nRandom animal");

        //Print random animal
        animal = getAnimal();

        animal.makeSound();

    }

    private static Animal getAnimal() {

        List<Animal> animalList = Arrays.asList(
                new Cat(),
                new Dog(),
                new Animal(),
                new Duck());
        //System.out.println(animalList.size()); //3
        int random = (int) (Math.random() * animalList.size());

        //System.out.println(random);
        return animalList.get(random);
    }


}


//-----------------------------------------------------------------------------------------------

class Animal {
    void makeSound() {
        System.out.println("zzzzzz");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Miauuuu");
    }
}

class Dog extends Animal{
    void makeSound() {
        System.out.println("Guauaaau");
    }
}
class Duck extends Animal{
    void makeSound() {
        System.out.println("Quak quak");
    }
}