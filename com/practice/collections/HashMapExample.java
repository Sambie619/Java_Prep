package com.practice.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        int id;
        String name;
        char choice;
        HashMap<Integer, String> studentmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Student ID:");
            id = sc.nextInt();
            System.out.println("Enter Student Name:");
            name = sc.next();
            studentmap.put(id, name);
            System.out.println("Do you want to add more students? (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        sc.close();
        System.out.println("\n**********************************");
        System.out.println("The following students are in database");
        System.out.println(" ID " + " Name");
        for(int i: studentmap.keySet()) {
            System.out.println(" " + i + "   " + studentmap.get(i));
        }
        System.out.println("**********************************");
    }

}
