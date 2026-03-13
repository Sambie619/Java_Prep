package com.practice.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,3,7,1,5);

        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
