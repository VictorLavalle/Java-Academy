package com.java.academy.week2.day2.arraysSearch;

import static java.util.Arrays.sort;

public class Principal {
    public static void main(String[] args) {

        //Array of Strings to be sorted
        String[] strings = { "10", "ab", "a", "A" };

        //this a native method of Arrays class that sorts an array of objects
        // that implements Comparable interface (String implements Comparable interface)
        // and it sorts the array in ascending order (alphabetical order)
        sort(strings);


        //Print the array sorted using a for-each loop
        for (String string : strings){
            System.out.print(string + " "); // A a 10 ab
        }

    }
}
