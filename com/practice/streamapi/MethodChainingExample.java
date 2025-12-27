package com.practice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MethodChainingExample{
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(List.of("Sabin Shah","G Venkateshwar","Lionel Messi"));
        List<String>filteredList=names.stream().filter(s->s.length()>5)
                                            .filter(s->s.startsWith("S"))
                                            .filter(s->s.contains("a"))
                                            .collect(Collectors.toList());
        System.out.println(filteredList);

    }
}
