package com.practice.strings;

public class Concatenation {
    public static void main(String[] args) {
        String s = "Luminar" + " Technolab";
        System.out.println(s); // Luminar Technolab
        String s1 = "Luminar ";
        String s2 = "Technolab";
        String s3 = s1.concat(s2);
        System.out.println(s3); // Luminar Technolab
        String s6 = "LuminarTechnolab";
        System.out.println(s6.substring(7));    // Technolab
        System.out.println(s6.substring(0, 7)); // Luminar
        String m= " Luminar ";
        System.out.println(m.toUpperCase());   // LUMINAR
        System.out.println(m.toLowerCase());   // luminar
        System.out.println(m.trim());          // removes spaces
        System.out.println(m.startsWith("Lu"));// true
        System.out.println(m.endsWith("r"));   // true
        System.out.println(m.charAt(0));       // L
        System.out.println(m.length());        // length
        System.out.println(m.replace("ar","art")); // Luminart
    }
}
