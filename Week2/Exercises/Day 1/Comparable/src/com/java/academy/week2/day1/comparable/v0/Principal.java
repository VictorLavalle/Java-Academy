package com.java.academy.week2.day1.comparable.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        String[] numbersInLetters = {"Uno","Dos","Tres","Cuatro","Cinco","Seis"};
        //Arrays.sort(numbersInLetters); //Compile error: The method sort(Object[]) in the type Arrays is not applicable for the arguments (String[])
        System.out.println(Arrays.toString(numbersInLetters));

        int[] numbers = {45,78,12,7,29};
        Arrays.sort(numbers); //Sorts the array in ascending order
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------");

        List<String> listNumberInLetters = new ArrayList<>();
        listNumberInLetters.add("Uno");
        listNumberInLetters.add("Dos");
        listNumberInLetters.add("Tres");
        listNumberInLetters.add("Cuatro");
        listNumberInLetters.add("Cinco");

        //Sorts the list in natural order (alphabetical order for Strings, ascending order for numbers)
        Collections.sort(listNumberInLetters);
        System.out.println(listNumberInLetters);

        System.out.println("--------------");

        //Convert array to list and sort it using Collections.sort method (natural order)
        // This way is not recommended because it is not type safe (it is not checked at compile time)
        List<String> listNumberInLetters2 =
                Arrays.asList(numbersInLetters);
        Collections.sort(listNumberInLetters2);

        System.out.println(listNumberInLetters2);


    }
}

