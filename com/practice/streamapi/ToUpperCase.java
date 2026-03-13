package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
