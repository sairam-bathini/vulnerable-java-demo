package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        // ❌ SQL Injection vulnerability
        String query = "SELECT * FROM users WHERE username = '" + username + "'";

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            Statement stmt = conn.createStatement();

            stmt.executeQuery(query);

            System.out.println("Query executed: " + query);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ❌ Hardcoded credential (security issue)
        String password = "admin123";

        // ❌ Weak encryption example
        String data = "sensitiveData";
        String encrypted = data; // No encryption

        System.out.println("Done");
    }
}
