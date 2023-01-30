package com.java.academy.week2.day2.tryWithResource.demo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection2 {
    public static void main(String[] args) {

        // try-with-resources statement will auto close the resourcc
        try (Connection conn = getConnection()) {
            assert conn != null; // conn is final and cannot be reassigned in the try block
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("select * from empleado")) {
                // Returns a JDBC Connection
                // executes query
                // close rs, stmt, conn
                // insert in pojos
            }
        } catch (Exception e) {
            // handle any exception
        }
        // log
        // log
        // log
    }


    // This method will return a connection to the database
    static Connection getConnection() {
        return null;
    }

}
