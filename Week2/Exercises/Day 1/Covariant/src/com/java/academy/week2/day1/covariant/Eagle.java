package com.java.academy.week2.day1.covariant;

abstract class Eagle implements Bird {

    // Covariant return type is allowed in Java 5.0 and later versions of Java
    // (see http://docs.oracle.com/javase/tutorial/java/IandI/covariant.html)
    // Covariant return type is a feature that allows a method to override a method
    // with a more specific return type.

    @Override
    public Number fly() {
        return Integer.valueOf(5);
    }

}
