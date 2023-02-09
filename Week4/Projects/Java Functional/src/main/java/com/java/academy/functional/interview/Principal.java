package com.java.academy.functional.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Instruction: Given a list of numbers, find the number that is not repeated

public class Principal {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 4, 3, 5, 1, 5, 7, 8, 8, 7);
        checkNumberNotRepeated(list);
    }

    public static void checkNumberNotRepeated(List<Integer> numbers) {
        // Create a map with the number as the key and the count of its occurrences as the value
        Map<Integer, Long> map = numbers.stream()

                // Group the numbers by their identity (i.e. their value) and count the number of occurrences of each number
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        // Find the first entry in the map whose value is 1 (i.e. the number that only appears once)
        map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()

                // If the entry is found, print the key (i.e. the number that only appears once)
                .ifPresent(entry -> System.out.println("The number not repeated is: " + entry.getKey()));
    }

}
