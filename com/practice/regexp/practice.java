package com.practice.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Sabin6"));
        System.out.println(Pattern.matches("^[6-9]\\d{9}$","9496519653"));
        //find the word shah
        Pattern p=Pattern.compile("luminar",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher("Visit luminar!!!");
        if(m.find()) {
            System.out.println("match found");
        }else{System.out.println("no match!!");}

    }
}
