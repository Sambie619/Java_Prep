package com.practice.streamapi;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "springboot", "microservices", "api");

        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println("Longest word: " + longest);
    }
}