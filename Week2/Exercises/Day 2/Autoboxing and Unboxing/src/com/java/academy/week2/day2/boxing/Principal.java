package com.java.academy.week2.day2.boxing;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        //Cannot use generics with primitive types (int, double, etc)
        // List<int> primitiveList;

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2) {
            li.add(i);
        }
    }

    // Java automatically converts primitive types to their object counterparts
    // and vice-versa.
    // This is called auto-boxing and unboxing. It is a feature of Java 5.
    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (int i : li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }

}
