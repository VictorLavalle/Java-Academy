package com.java.academy.week1.day4.conditionals;

public class Principal3 {
    public static void main(String[] args) {

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        LOOP_EXTERNO:
        for (int[] mySimpleArray : myComplexArray) {
            LOOP_INTERNO:
            for (int j : mySimpleArray) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

}
