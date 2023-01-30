package com.java.academy.week2.day1.comparable.v3;

import java.util.Comparator;

public class SortAge implements Comparator<Student> {

    // Sort by age in ascending order (from the youngest to the oldest)
    // if o1 is younger than o2, return negative number (o1 is before o2)
    // The compare method returns a negative integer, zero, or a positive
    // integer as the first argument is less than, equal to, or greater than the second.

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

}
