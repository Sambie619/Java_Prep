package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student s){
        if (age == s.age) {
            return 0;
        } else if (age > s.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
public class TestComparable {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("John", 25));
        al.add(new Student("Jo", 29));
        al.add(new Student("Mon", 22));
        System.out.println("Before Sorting:");
        for(Student s: al){
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        Collections.sort(al);
        System.out.println("After Sorting:");
        for(Student s: al){
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }
}
