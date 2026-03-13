package com.practice.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 4, 1, 5};

        List<Integer> uniqueNumbers = Arrays.stream(numbers)
                                            .distinct()
                                            .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}
