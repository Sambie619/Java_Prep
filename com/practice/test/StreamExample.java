package com.practice.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        nums.stream().filter(n->n%2==0).forEach(System.out::println);//forEach(n -> System.out.println(n));
    }
}
