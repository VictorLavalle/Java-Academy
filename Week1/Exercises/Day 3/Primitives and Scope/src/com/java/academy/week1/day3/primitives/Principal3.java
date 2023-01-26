package com.java.academy.week1.day3.primitives;

public class Principal3 {

    public static void main(String[] args) {

        Principal3 principal3 = new Principal3();

        int result = principal3.calculate();
        System.out.println(result); //0
    }

    int calculate() {
        //LOCAL VARIABLES
        //DON'T NEED TO BE INITIALIZED
        int x;
        int y;

        x=0;
        y=0;

        return x+y;
    }

    // This method is not used in the main method but it's a good example of how to initialize a local variable
    String getWord() {
        //LOCAL VARIABLES
        //DON'T NEED TO BE INITIALIZED
        String cadena;
        cadena = "hola";
        return cadena;
    }

    String getWeirdWord() {
        //LOCAL VARIABLES
        //DON'T NEED TO BE INITIALIZED
        String cadena;
        cadena = null;
        return cadena;
    }


}
