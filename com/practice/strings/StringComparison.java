package com.practice.strings;

public class StringComparison{
    public static void main(String[] args) {
        String s1 = "Luminar";//SCP
        String s2 = "Luminar";//SCP
        String s3 = new String("Luminar");//Heap
        String s4 = "LUMINAR";
        String s5 = "Oracle";
        // compares CONTENT
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // true
        System.out.println(s1 == s2); // true (same SCP object)
        System.out.println(s1 == s3); // false (different memory)
        System.out.println(s1.compareTo(s2)); // 0  alpha order compa
        System.out.println(s1.compareTo(s5)); // negative
        System.out.println(s5.compareTo(s1)); // positive

    }
}
