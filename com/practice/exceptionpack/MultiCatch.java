package com.practice.exceptionpack;

public class MultiCatch {
    public static void main(String[] args) {
        String s=null;
        try {
           System.out.println(s.length());
            int a = 10 / 0;
        }
        catch (NullPointerException | ArithmeticException e) {
            //not IOException | Exception no par child rln
            System.out.println(e);
        }
        System.out.println("djddf");
    }
}
