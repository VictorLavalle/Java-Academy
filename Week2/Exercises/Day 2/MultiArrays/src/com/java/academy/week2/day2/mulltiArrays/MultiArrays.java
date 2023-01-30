package com.java.academy.week2.day2.mulltiArrays;

public class MultiArrays {

    public static void main(String[] args) {

//		int[] listU = {1,4,5,7};
//
//		for (int i: listU) {
//
//		}
//
//
//		int[][] listB = { { 1, 13,78 }, { 5, 2,12,56 }, { 12, 62 } };
//
//		for ( int[] array :listB) {
//
//		}

        int sum = 0;

        // 3D array (3D matrix)
        int[][][] listT = {{{1, 13, 7}, {5, 2}, {2, 2, 7}},
                {{2, 45}, {5, 2}, {12, 82, 78}}};

        // Traverse the 3D array and sum all the elements in it
        for (int[][] arrayBi : listT) {
            for (int[] arrayUni : arrayBi) {
                for (int i : arrayUni) {
                    sum += i;
                }
            }
        }

        System.out.println(sum); //265

    }


}



