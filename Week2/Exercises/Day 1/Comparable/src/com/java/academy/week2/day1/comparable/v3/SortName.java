package com.java.academy.week2.day1.comparable.v3;

import java.util.Comparator;

public class SortName implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
