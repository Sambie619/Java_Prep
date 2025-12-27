package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GenerateCustomerBill {
    public static void main(String[] args) {
        // JDBC details
        String url = "jdbc:mysql://localhost:3306/jprep";
        String user = "root";
        String pass = "Sabin2003";
        int customerId = 1; // assume customer id already exists
        // STEP 1: Load and register JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // STEP 2: Create connection + statements using try-with-resources
        try (
            // create connection object
            Connection conn = DriverManager.getConnection(url, user, pass);
            // create prepared statement (JOIN query)
            PreparedStatement pstmt = conn.prepareStatement(
                "SELECT c.customer_name, c.mobile, " +
                "i.item_name, i.price, i.quantity, " +
                "(i.price * i.quantity) AS total " +
                "FROM customer c " +
                "JOIN item i ON c.customer_id = i.customer_id " +
                "WHERE c.customer_id = ?"
            )
        ) {
            // STEP 3: Set values to placeholder
            pstmt.setInt(1, customerId);
            // STEP 4: Execute query
            ResultSet rs = pstmt.executeQuery();
            double grandTotal = 0;
            boolean found = false;
            System.out.println("\n------------ CUSTOMER BILL ------------");
            // STEP 5: Process result set
            while (rs.next()) {
                if (!found) {
                    // print customer details once
                    System.out.println("Customer Name : " + rs.getString("customer_name"));
                    System.out.println("Mobile        : " + rs.getString("mobile"));
                    System.out.println("-----------------------------------------------");
                    System.out.printf("%-15s %-10s %-5s %-10s\n",
                            "Item", "Price", "Qty", "Total");
                    System.out.println("-----------------------------------------------");
                    found = true;
                }
                // print each item row
                System.out.printf("%-15s %-10.2f %-5d %-10.2f\n",
                        rs.getString("item_name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity"),
                        rs.getDouble("total")
                );
                grandTotal += rs.getDouble("total");
            }
            if (found) {
                System.out.println("-----------------------------------------------");
                System.out.printf("GRAND TOTAL : %.2f\n", grandTotal);
            } else {
                System.out.println("No records found for this customer.");
            }
            // STEP 6: Resources auto-closed by try-with-resources
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
