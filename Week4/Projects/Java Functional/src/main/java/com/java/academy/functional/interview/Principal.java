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
        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry ->
                        System.out.println("The number not repeated is: " + entry.getKey()));
    }

}
