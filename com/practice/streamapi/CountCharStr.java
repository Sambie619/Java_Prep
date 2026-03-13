package com.practice.streamapi;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharStr {
    public static void main(String[] args) {
        String str = "banana";

Map<Character, Long> map =
    str.chars()
       .mapToObj(c -> (char) c)
       .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

System.out.println(map);
    }
}
