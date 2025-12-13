package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial collection value: " + list);
        Collections.addAll(list, "Date", "Elderberry", "Fig");
        System.out.println("After adding more elements: " + list);
        String[] arr = {"Grape", "Honeydew"};
        Collections.addAll(list, arr);
        System.out.println("After adding array elements: " + list);
        Collections.sort(list);
        System.out.println("After sorting the collection: " + list);
    }

}
