package com.practice.exceptionpack;
public class NestedTryDemo {

    public static void main(String[] args) {

        try {
            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int arr[] = new int[5];
                arr[10] = 5;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }
        catch (Exception e) {
            System.out.println("outer exception");
        }

        System.out.println("normal flow");
    }
}
