package com.practice.jdknewfeatures;

import java.util.ArrayList;
import java.util.List;

public class BoundedGeneric{
    
    public static <T extends Comparable<T>> int compare(T a,T b){
        return a.compareTo(b);
    }

    static void printList(List<?>list){//wildcard
        System.out.println(list);
    }
    public static void main(String[] args) {
        System.out.println(compare("Bini", "Bini"));
        System.out.println(compare(10, 20));
        List<String>l1=new ArrayList<>(List.of("Sabin","Sam"));
        List<Integer>l2=new ArrayList<>(List.of(1,2,3,4,5));
        printList(l2);
        printList(l1);
    }
}
