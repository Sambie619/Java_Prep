package com.practice.test;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public int compareTo(Employee e){
        return Double.compare(this.salary,e.salary);
    }
}
public class comparableTest {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Sabin", 1, 546645.54));
        list.add(new Employee("Abin", 2, 5466453.54));
        list.add(new Employee("Sani", 3, 34645.54));
        list.add(new Employee("Ann", 4, 536788.54));
        // SCENARIO 1: Use Natural Order (Salary) - Calls your compareTo()
        Collections.sort(list);
        System.out.println("--- Sorted by Salary (Comparable) ---");
        list.forEach(e->{System.out.println("Name :"+e.name);
                        System.out.println("id :"+e.id);
                        System.out.println("Salary :"+e.salary);
        });
        // SCENARIO 2: Custom Order (Name) - Uses a Comparator
        // 2. We pass the logic as a second argument to sort()
        Collections.sort(list,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println("\n--- Sorted by Name (Comparator) ---");
         list.forEach(e->{System.out.println("Name :"+e.name);
                        System.out.println("id :"+e.id);
                        System.out.println("Salary :"+e.salary);
        });

    }
}
