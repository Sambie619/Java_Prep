package com.practice.oops;
/*
=========================================================
INNER CLASSES IN JAVA - COMPLETE REVISION FILE
=========================================================

1) NON-STATIC INNER CLASS
✔ Can access all variables (static + non-static) of outer class
✔ Needs outer class object
❌ Cannot have static members

Syntax:
Outer obj = new Outer();
Outer.Inner in = obj.new Inner();
in.show();

---------------------------------------------------------
2) STATIC NESTED CLASS
✔ Can access ONLY static members of outer class
✔ No outer class object needed
✔ CAN have static methods

Syntax:
Outer.Inner obj = new Outer.Inner();
obj.show();

---------------------------------------------------------
3) LOCAL INNER CLASS
✔ Defined inside a method
✔ Scope limited to that method only
✔ Cannot be accessed outside the method

---------------------------------------------------------
4) ANONYMOUS INNER CLASS
✔ No class name
✔ Used for one-time use
✔ Mostly used with interfaces & threads
✔ Overrides methods instantly
=========================================================
*/

class Outer {

    int x = 10;              // non-static variable
    static int y = 20;       // static variable

    // --------------------------------------------------
    // 1) NON-STATIC INNER CLASS
    // --------------------------------------------------
    class Inner {
        void show() {
            System.out.println("Non-static Inner Class");
            System.out.println("x = " + x); // can access non-static
            System.out.println("y = " + y); // can access static
        }
    }

    // --------------------------------------------------
    // 2) STATIC NESTED CLASS
    // --------------------------------------------------
    static class StaticInner {
        static void show() {
            System.out.println("Static Nested Class");
            System.out.println("y = " + y); // can access ONLY static
            // System.out.println(x); ❌ not allowed
        }
    }

    // --------------------------------------------------
    // 3) LOCAL INNER CLASS
    // --------------------------------------------------
    void display() {
        class LocalInner {
            void show() {
                System.out.println("Local Inner Class inside method");
            }
        }

        LocalInner obj = new LocalInner();
        obj.show();
    }
}

// --------------------------------------------------
// 4) ANONYMOUS INNER CLASS
// --------------------------------------------------
class A {
    void show() {
        System.out.println("A class show()");
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        System.out.println("----- Non-static Inner Class -----");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

        System.out.println("\n----- Static Nested Class -----");
        Outer.StaticInner.show();

        System.out.println("\n----- Local Inner Class -----");
        outer.display();

        System.out.println("\n----- Anonymous Inner Class -----");
        A obj = new A() {
            void show() {
                System.out.println("Anonymous Inner Class show()");
            }
        };
        obj.show();
    }
}

