package com.practice.optionalpack;

import java.util.Optional;

public class OptionalMore {
    public static void main(String[] args) {

        Optional<String>ofc=Optional.of("Luminar Technolab");//nonnull
        Optional<String>nothing=Optional.empty();//empty optional
        // ---------------- isPresent() ----------------
        // Checks whether value exists inside Optional
        if(ofc.isPresent()){
            System.out.println("We are @ Luminar");
        }else{
            System.out.println("No class today");
        }
        // If value present -> return it
        // If empty -> return default value
        System.out.println(ofc.orElse("value ..."));//null anel value... pritnum
        System.out.println(nothing.orElse("value ..."));
        // Filter value using condition (Predicate)
        Optional<String>myName=Optional.of("SABIN");
        System.out.println(myName.filter(g->g.equals("sabin")));// case-sensitive
        System.out.println(myName.filter(g->g.equals("SABIN")));// exact match
        System.out.println(myName.filter(g->g.equalsIgnoreCase("sabin")));// case-insensitive
        System.out.println(nothing.filter(g->g.equals("sabin")));// case-sensitive

}
}
