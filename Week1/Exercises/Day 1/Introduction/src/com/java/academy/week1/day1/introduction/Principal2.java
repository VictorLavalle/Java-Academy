package com.java.academy.week1.day1.introduction;

public class Principal2 {
    public static void main(String[] args) {

        /**
         * Cuántos objetos se han creado? = 1
         * Cuántas variables de referencia se han creado? = 4
         * Una variable de referenciq no es un objeto!
         * Las variables de referencia apunta a un objeto que nació con una propedad
         * Ejemplo: String nombre = "Juan";
         */
        String x = "Hello";
        String y = "World";
        String z = x + y;

        //Instanciar un objeto de la clase String
        //2 objetos
        String w = new String("Hello");

        //Objeto vacío --> incorrecto
        //Se borra la referencia,ya no apunta a nada
        y= null;

        //Concatenar
        x.concat(" World");
        System.out.println(x); //Hello

        //Concatenar
        System.out.println(x.equals(w)); //false

        //Comparación de objetos
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1.equals(sb2)); //false
    }
}