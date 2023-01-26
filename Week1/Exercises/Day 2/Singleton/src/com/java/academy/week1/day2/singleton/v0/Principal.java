package com.java.academy.week1.day2.singleton.v0;

public class Principal {

    public static void main(String[] args) {

        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Connection connection3 = Connection.getInstance();
        Connection connection4 = Connection.getInstance();
        Connection connection9999 = Connection.getInstance();

        System.out.println(connection4);
        System.out.println(Connection.contador); //1
    }


}
