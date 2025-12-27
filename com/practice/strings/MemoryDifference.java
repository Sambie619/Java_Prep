package com.practice.strings;

public class MemoryDifference {
    public static void main(String[] args) {
        // Stored in String Constant Pool
        String s1 = "java";
        String s2 = "java";
        // Stored in Heap (new object)
        String s3 = new String("java");
        System.out.println(s1 == s2); // true (same reference)
        System.out.println(s1 == s3); // false (different memory)
        String s4=s3.intern();//moves to scp
        System.out.println(s1 == s4); // true (same reference)
        int a =10;
        String x=String.valueOf(a);//conv int to strings
        System.out.println(x+ 10); // 1010

    }
}
