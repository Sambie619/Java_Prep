package com.practice.exceptionpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptions {
    public static void main(String[] args) {
        File mf = new File("asf.pdf");
        
        try (BufferedReader br = new BufferedReader(new FileReader(mf))) { // auto fl clsing
            String line ;
            while ((line=br.readLine())!=null){
            System.out.println("File content : " + line);}
        }
        catch (FileNotFoundException e) {
            System.err.println("Err couldnt find file");
        }
        catch (IOException e) {
            System.err.println("Err while reading contents...");
        }

        String url = "jdbc:mysql://localhost:3306/mydb";
        // This will fail if no database is running at the URL
        try (Connection conn = DriverManager.getConnection(url, "username", "pass")) {
            System.out.println("Connected to db succ");
        }
        catch (SQLException e) {
            System.err.println("Error state : " + e.getSQLState()); // crrct err code
            System.err.println("Error msg : " + e.getMessage()); // err msg
        }
    }
}
