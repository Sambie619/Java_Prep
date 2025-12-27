package com.practice.exceptionpack;

public class UncheckedExceptions {
    public static void main(String[] args) {
        // 1. NullPointerException (NPE)
        // Occurs when you try to use an object that hasn't been created (is null)
        try {
            String txt = null;
            System.out.println(txt.length());
        }
        catch (NullPointerException e) {
            System.err.println("NPE ERR:Var was null");
        }

        // 2. ArithmeticException Occurs during impossible math operations, like dividing by zero
        try {
            int data = 10 / 0;
        }
        catch (ArithmeticException e) {
            // or e.printStackTrace(); pritns exce details
            System.err.println("MATH ERR:cant div by 0");
        }

        // lly ArrayIndexOutOfBoundsException when u try to retrieve val of uninitialized index
        // 3. Error (DO NOT HANDLE) OutOfMemoryError, StackOverflowError
    }
}
