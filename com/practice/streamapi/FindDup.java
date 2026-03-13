package com.practice.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDup {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,2,5,3);
        Set<Integer>seen=new HashSet<>();
        list.stream().filter(n->!seen.add(n)).forEach(System.out::println);
    }
}
