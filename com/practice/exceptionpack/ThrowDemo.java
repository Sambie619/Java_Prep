package com.practice.exceptionpack;

public class ThrowDemo {
    static void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            validate(13);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("rest of the code");
    }
}
