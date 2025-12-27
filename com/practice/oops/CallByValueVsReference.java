package com.practice.oops;
class Test {
    int value = 10;
}
public class CallByValueVsReference {
    // -------------------------------
    // Call by Value (Primitive)
    // -------------------------------
    static void changePrimitive(int x) {
        x = 100;
    }
    // -------------------------------
    // Object example (Reference value passed)
    // -------------------------------
    static void changeObject(Test t) {
        t.value = 100;
    }

    // -------------------------------
    // Proof Java is NOT call by reference
    // -------------------------------
    static void changeReference(Test t) {
        t = new Test();   // new object
        t.value = 999;
    }

    public static void main(String[] args) {

        // 1️⃣ Primitive example
        int a = 10;
        changePrimitive(a);
        System.out.println("Primitive value: " + a); // 10

        System.out.println("---------------------");

        // 2️⃣ Object data change
        Test obj1 = new Test();
        changeObject(obj1);
        System.out.println("Object value after change: " + obj1.value); // 100

        System.out.println("---------------------");

        // 3️⃣ Reference change proof
        Test obj2 = new Test();
        changeReference(obj2);
        System.out.println("Object value after reference change attempt: " + obj2.value); // 10
    }
}/*Primitive value: 10
Object value after change: 100
Object value after reference change attempt: 10*/
