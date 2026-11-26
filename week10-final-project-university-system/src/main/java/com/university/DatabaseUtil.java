package com.university;

import java.sql.Connection; // Imports the Connection interface
import java.sql.DriverManager; // Imports the DriverManager class to establish connections
import java.sql.SQLException; // Imports SQLException to handle database errors

// This class handles the connection to the database
public class DatabaseUtil {


    private static final String URL = "jdbc:mysql://localhost:3306/university_db";
    private static final String USER = System.getenv().getOrDefault("MYSQL_USER", "root");

    public static Connection getConnection() throws SQLException {
        String password = System.getenv("MYSQL_PASSWORD");
        if (password == null || password.isEmpty()) {
            throw new SQLException("Set the MYSQL_PASSWORD environment variable before connecting.");
        }
        return DriverManager.getConnection(URL, USER, password);
    }
}
