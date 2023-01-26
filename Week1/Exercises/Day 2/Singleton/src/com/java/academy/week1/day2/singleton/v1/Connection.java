package com.java.academy.week1.day2.singleton.v1;

public class Connection {

    //HAS-A (Composition)
    static private Connection connection = new Connection("MySQL");

    private String dbms;
    static int contador;

    private Connection(String dbms) {
        // connect to DB
        contador++;
    }

    public static Connection getInstance() {
        return connection;
    }

}
