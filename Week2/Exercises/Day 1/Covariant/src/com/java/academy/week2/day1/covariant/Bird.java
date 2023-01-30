package com.java.academy.week2.day1.covariant;

public interface Bird {

    Number fly(); 
    //This interface method is implemented in the Eagle class and the BaldEagle class 
    //with a more specific return type (Double and Integer respectively).
    //This is allowed because the return type is covariant. 
    
    // A covariant return type is a feature that allows a method to override a method
    // with a more specific return type.
    // For example, the method fly() in the Eagle class overrides the method fly() in the Bird interface.
    // The method fly() in the Eagle class has a more specific return type (Integer) than the method fly()
    // in the Bird interface (Number).

}
