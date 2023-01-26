package com.java.academy.week1.day1.introduction;

public class Principal3 {

    public static void main (String[] args) {

        String s = "Hello"; //Inmutable ---> Objeto
        StringBuilder sb = new StringBuilder("Hello"); //Mutable ---> Objeto

        s = "Another hello"; //Inmutable ---> Objeto, al hacer esto, se crea un nuevo objeto no se modifica el anterior
        System.out.println(s);

        s.concat(" World");
        //s = s.concat(" World");
        sb.append(" World");

        System.out.println(s);
        System.out.println(sb);
    }
}
