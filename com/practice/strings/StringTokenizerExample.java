package com.practice.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer st =
            new StringTokenizer("Luminar Technolab Kochi"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1=new StringTokenizer("A:B:C:D");
        System.out.println(st1.nextToken(":")); // A
    }
}
