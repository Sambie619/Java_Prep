package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String words=new String("The String , class is immutable : The String ; is a “final” class .");
        StringTokenizer st=new StringTokenizer(words," .,;:\"");
        List<String>wordlist=new ArrayList<>();
        while(st.hasMoreTokens()){
            String tmp=st.nextToken().toLowerCase();
            if(!wordlist.contains(tmp)){
                wordlist.add(tmp);
            }
        }
        Collections.sort(wordlist);
        for(String str:wordlist){
            System.out.println(str);
        }

        
    }
}
