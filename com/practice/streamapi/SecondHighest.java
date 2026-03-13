package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15);

        int secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighest);
    }
}
