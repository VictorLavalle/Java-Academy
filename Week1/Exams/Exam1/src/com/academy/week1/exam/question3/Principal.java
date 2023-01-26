package com.academy.week1.exam.question3;

//Intructions:
// Explain dependencies injection with a program example.
public class Principal {

        public static void main(String[] args) {

            //Button button = new Button();
            //Lamp lamp = new Lamp();
            //button.push(lamp);


            // Dependency injection with anonymous class
            new Button().push(new Lamp());
            new Button().push(new AirConditioner());


        }

}
