package com.practice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSimpleProgram{
    public static void main(String[] args) {
         // Creating list of names
        List<String>names=new ArrayList<>(List.of("BiniBindu", "Rukku", "Nitya", "Ani","Sabin Shah"));
        // Convert list to stream
        Stream<String>allNames=names.stream();
         // Filter names with length > 6
        Stream<String> longNames =allNames.filter(str->str.length()>6);
         // Print each element
         //longNames.forEach(System.out::println);//using meth ref
         longNames.forEach(str->System.out.print(str + " "));
        // or names.stream().filter(str -> str.length() > 6).forEach(name -> System.out.print(name + " "));



    }
}
