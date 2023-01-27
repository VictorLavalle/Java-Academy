package com.java.academy.week2.day2.arraysSearch;

import java.util.Arrays;

public class Principal2 {
    public static void main(String[] args) {

        //Array of Strings to be sorted
        String[] strings = { "10", "ab", "a", "A" };

        //Array of integers to be sorted
        int[] numbers = {4,6,8,2,3,1};

        Arrays.sort(numbers); //sorts the array in ascending order

        //Makes a binary search in the array. This a native method of Arrays classs,
        // but it requires the array to be sorted. Returns the index of the element if found, otherwise returns -1
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println("----------");

        //Same as above, but in the binary search the element is not found in the array.
        //so it returns a negative number that is the complement of the index where the element should be inserted
        int[] numbers2 = {2,6,8,10};
        System.out.println(Arrays.binarySearch(numbers2, 20));

    }
}
