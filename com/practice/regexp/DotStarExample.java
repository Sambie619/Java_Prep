package com.practice.regexp;

import java.util.regex.Pattern;

public class DotStarExample{
    public static void main(String[] args) {
        String text = "This is Sabin from infopark";
        String pattern = ".*park.*";
        boolean res=Pattern.matches(pattern,text);
        System.out.println(res);
        System.out.println(Pattern.matches("\\d", "1"));   // true
        System.out.println(Pattern.matches("\\d", "12"));  // false
        System.out.println(Pattern.matches("\\D", "a"));   // true
        System.out.println(Pattern.matches("\\D", "1"));   // false
        System.out.println("123".matches("\\d{3}"));
        System.out.println("12".matches("\\d{3}"));
        System.out.println("123".matches("\\d{2,}"));
        System.out.println("1".matches("\\d{2,}"));
        System.out.println("1235345".matches("\\d{2,4}"));
        System.out.println("123".matches("\\d+"));
        System.out.println("".matches("\\d+}"));
    }
}
