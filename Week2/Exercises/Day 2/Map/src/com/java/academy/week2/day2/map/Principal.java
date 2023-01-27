package com.java.academy.week2.day2.map;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("koala", "Bamboo");
        map.put("pato", "Donald");
        map.put("gato", "Benito");
        map.put("pato", "Lucas");
        map.put("ave", "Bamboo");

        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(0, "Bamboo");
        map1.put(1, "Donald");
        map1.put(2, "Benito");
        map1.put(0, "Lucas");
        map1.put(4, "Bamboo");

        for (int key : map1.keySet())
            System.out.println(key + " " + map1.get(key));

        System.out.println("-------------");

        Student e1 =new Student("Juan", 18, 8.5);
        Student e2 =new Student("Maria", 20, 9.1);
        Student e3 =new Student("Pedro", 22, 7.8);
        Student e4 =new Student("Ana", 19, 9.2);
        Student e5 =new Student("Mary", 29, 7.2);

        Map<String,Student> mapaStudents =
                new HashMap<>();

        mapaStudents.put("Z01", e1);
        mapaStudents.put("Z02", e2);
        mapaStudents.put("Z03", e3);
        mapaStudents.put("Z04", e4);
        mapaStudents.put("Z05", e5);

        System.out.println(mapaStudents.get("Z04"));

        Set<String> setString = mapaStudents.keySet();

        System.out.println(setString);

        System.out.println("---------");

        Collection<Student> listStudents =
                mapaStudents.values();

        System.out.println(listStudents);


    }
}
