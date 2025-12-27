package com.practice.oops;
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() cheytale garbage terathe printu
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // same reference
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return id;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(1, "Rahul");
        // toString()
        System.out.println(s1);
        // equals()
        System.out.println("s1 equals s2: " + s1.equals(s2));
        // hashCode()
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        // getClass()
        System.out.println("Class name: " + s1.getClass().getName());
    }
}
