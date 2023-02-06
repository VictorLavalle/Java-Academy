package com.java.academy.rest;

import java.util.Random;

public class Constants {

    public static String URL = "http://localhost:8080";
    public static Random random;

    static {
        random = new Random();
    }

    public static int getRandomId() {
        return random.nextInt(1000000);
    }

    public static int getRandomHours() {
        return random.nextInt(50);
    }

    public static double getAverage() {
        return Math.round(random.nextDouble() * 100d) / 10d;
    }
}
