package com.practice.designpatternpack;

class Singleton {

    private static Singleton instance;

    // private constructor prevents object creation
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton object created");
    }
}

public class TestSingleton {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2); // true
    }
}
/*Ensures only one object of a class exists in the entire application.
When used
Logger
Database connection
Configuration manager 

Category:Creational*/
