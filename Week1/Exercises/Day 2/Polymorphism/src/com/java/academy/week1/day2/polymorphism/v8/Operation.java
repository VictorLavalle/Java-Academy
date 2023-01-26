package com.java.academy.week1.day2.polymorphism.v8;

// This is the interface that all operations must implement
public interface Operation {

    //public static final String LUNES = "Lunes"; ---> public static final is optional in interfaces because it is the default behavior of an interface
    //String MARTES = "Martes";  --> It's ua constant, so it's public static final by default. Upper case is a convention for constants

    //pubic final static  ---> public static final is optional in interfaces because it is the default behavior of an interface

    //public static final boolean r = true;

    int execute();


//  static void StaticMethod() {
//		System.out.println("Static");
//	}
//
//	default void DefaultMethod() {
//		System.out.println("Default");
//	}
//
//	private static void privateStaticMethod() {
//		System.out.println("Static");
//	}
//
//	private void privateMethod() {
//		System.out.println("Private");
//	}


    }
