package com.practice.streamapi;

import java.util.List;
import java.util.Optional;

public class MaxNum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,23,1,2,67);
        Optional<Integer>max=nums.stream().max(Integer::compare);
        System.out.println(max.get());

    }
}
