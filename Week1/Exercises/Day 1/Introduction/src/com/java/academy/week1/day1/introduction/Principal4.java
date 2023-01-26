package com.java.academy.week1.day1.introduction;

public class Principal4 {

    public static void main(String[] args) {

        String s = "Hola";
        int x = 5;
        StringBuilder sb = new StringBuilder("Hello");

        execute(s, x, sb);

        System.out.println(s);
        System.out.println(x);
        System.out.println(sb);

        s = otherExecute(s,x,sb);

        System.out.println(s);
    }

    static void execute(String s, int x, StringBuilder sb) {
        s = s.concat(" mundo");
        x = x + 5;
        sb.append(" World");
    }

    static String otherExecute(String s, int x, StringBuilder sb) {
        return s.concat(sb.toString()+x);
    }
}
