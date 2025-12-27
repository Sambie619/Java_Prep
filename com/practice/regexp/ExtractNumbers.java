package com.practice.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers  {
    public static void main(String[] args) {
        String text = "Price: 120, Discount: 25, Tax: 8";
        Matcher m=Pattern.compile("\\d+").matcher(text);
        while(m.find()){
            System.out.println("Found number: " + m.group());
        }
    }
}
