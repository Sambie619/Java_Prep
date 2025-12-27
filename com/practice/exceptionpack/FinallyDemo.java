package com.practice.exceptionpack;

public class FinallyDemo {
    public static void main(String[] args) {

        try {
            int data = 25 / 5;
            System.out.println(data);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally always executes");
            //for closing files,reso,db...
        }

        System.out.println("rest of the code");
    }
}
