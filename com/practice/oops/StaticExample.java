package com.practice.oops;
class Counter{
    static int count=0; // static variable (shared across all objects)belongs to class
    Counter(){
        count++;
        System.out.println("Object created. Count = " + count);
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println("Final count: "+Counter.count);
    }
}
