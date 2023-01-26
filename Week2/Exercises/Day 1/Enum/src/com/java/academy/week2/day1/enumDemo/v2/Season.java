package com.java.academy.week2.day1.enumDemo.v2;

public enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    AUTUMN("Null");

    private String visitorsExpected;

    Season(String visitorsExpected) {
        this.visitorsExpected = visitorsExpected;
    }

    public String getVisitorsExpected() {
        return visitorsExpected;
    }
}
