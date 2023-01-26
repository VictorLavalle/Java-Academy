package com.java.academy.week2.day1.enumDemo.v1;

public class Principal {

    public static void main(String[] args) {

        Season season = Season.WINTER;

        //System.out.println(season);// WINTER
        //System.out.println(season==Season.SUMMER); // false

        // Print all values of enum Season
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        // Print all values of enum Season using switch statement
        switch (season) {
        case WINTER:
            System.out.println("Winter");
            break;
        case SPRING:
            System.out.println("Spring");
            break;
        case SUMMER:
            System.out.println("Summer");
            break;
        case AUTUMN:
            System.out.println("Autumn");
            break;
        default:
            System.out.println("Unknown season");
            break;
        }


    }
}
