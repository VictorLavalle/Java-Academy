package com.java.academy.week1.day2.singleton.v0;

public class Connection {

    //HAS-A (Composition)
    static private Connection connection;

    private String dbms;
    static int contador;

    private Connection(String dbms) {
        // connect to DB
        contador++;
    }

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection("MySQL");
        }
        return connection;
    }
}
