package com.practice.exceptionpack;

public class ExceptionPropagation {
        // exception occurs here
    void display() {
        int data = 50 / 0;  // 
    }
    // no handling here
    void print() {
        display();
    }
    // handling happens here
    void test() {
        try {
            print();
        }
        catch (Exception e) {
            System.out.println("exception handled");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.test();
        System.out.println("normal flow...");
    }
}
