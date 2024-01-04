package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRes = null;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria", "root", "9PM8tv$h#$*e");
            System.out.println("Conexión correcta");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Conexión errada");
        }
    }
}