package com.practice.test;

import java.util.ArrayList;
import java.util.Collections;

// Step 2: No "implements Comparable" here
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Step 3: No "compareTo" method needed inside this class anymore!
}
public class comparatorTest {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Sabin", 1, 546645.54));
        list.add(new Employee("Abin", 2, 5466453.54));
        list.add(new Employee("Sani", 3, 34645.54));
        list.add(new Employee("Ann", 4, 536788.54));

        // IMPORTANT: Collections.sort(list) would now FAIL to compile 
        // because the class is no longer "Comparable".
        // You MUST pass a Comparator as the second argument.

        // Scenario: Sorting by Salary using a Comparator lambda
        Collections.sort(list, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        
        System.out.println("--- Sorted by Salary (Comparator) ---");
        list.forEach(e -> System.out.println(e.name + " : " + e.salary));

        // Scenario: Sorting by Name using a Comparator lambda
        Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\n--- Sorted by Name (Comparator) ---");
        list.forEach(e -> System.out.println(e.name));

        Collections.sort(list, (e1, e2) -> Integer.compare(e1.id, e2.id));
    }
}
