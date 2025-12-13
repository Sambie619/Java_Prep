package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
    int empno;
    String name;
    int age;
    Employee1(int empno, String name, int age) {
        this.empno = empno;
        this.name = name;
        this.age = age;
    }
}
class AgeComparator implements Comparator<Employee1>{
    public int compare(Employee1 e1,Employee1 e2){
        return Integer.compare(e1.age, e2.age);
    }
}

class NameComparator implements Comparator<Employee1>{
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.name.compareTo(e2.name);
    }
}
public class Simple {
    public static void main(String[] args) {
        ArrayList<Employee1>al=new ArrayList<>();
        al.add(new Employee1(114, "Devu", 25));
        al.add(new Employee1(105, "Bini", 26));
        al.add(new Employee1(108, "Kripz", 24));
        System.out.println("Sorting by Name...");
        Collections.sort(al,new NameComparator());
        for (Employee1 emp : al) {
            System.out.println(emp.empno + " " + emp.name + " " + emp.age);
        }
        System.out.println("\nSorting by Age...");
        Collections.sort(al,new AgeComparator());
        for (Employee1 emp : al) {
            System.out.println(emp.empno + " " + emp.name + " " + emp.age);
        }
    }
}
