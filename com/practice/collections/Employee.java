package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    int age;
    String name;
    Employee(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Employee e){
        if(age==e.age)return 0;
        else if(age>e.age)return 1;
        else return -1;
    }

    public String toString(){
        return age+","+name;
    }

    public static void main(String[] args) {
        ArrayList<Employee>al=new ArrayList<>();
        al.add(new Employee(22,"Sabin"));
        al.add(new Employee(21,"abin"));
        System.out.println("Initial List:");
        al.forEach(System.out::println);
        Collections.sort(al);
        System.out.println("After sorting:");
        al.forEach(System.out::println);
    }
}
