package com.java.academy.week2.day2.exceptions.v5;

public class CeroException extends Exception{

    // Constructor that accepts a message for the exception
    // This message will be displayed when the exception is thrown
    // By doing this, we can customize the exception message
    public CeroException(String message) {
        super(message);
    }

}
