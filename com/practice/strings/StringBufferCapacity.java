package com.practice.strings;

public class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16
        sb.append("Luminar Technolab Ernakulam");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // grows automatically
    }
}
