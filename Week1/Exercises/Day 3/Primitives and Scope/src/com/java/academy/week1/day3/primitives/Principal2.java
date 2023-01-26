package com.java.academy.week1.day3.primitives;

import java.math.BigDecimal;

public class Principal2 {

    public static void main(String[] args) {

        double a = 0.02;
        double b = 0.03;
        double c = b - a; //0.009999999999999998

        System.out.println(c); //0.01

        double res = ((b * 1000) - (a * 1000)) / 1000;
        System.out.println("*: " + res);

        //BigDecimal is a class that allows to work with decimals without losing precision
        BigDecimal _a = new BigDecimal("0.02");
        BigDecimal _b = new BigDecimal("0.03");
        BigDecimal _c = _b.subtract(_a); //0.01

    }

}
