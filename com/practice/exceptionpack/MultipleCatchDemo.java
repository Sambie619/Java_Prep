package com.practice.exceptionpack;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[5] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
        catch (Exception e) {
            System.out.println("Parent Exception");
        }

        System.out.println("rest of the code");
    }
}
