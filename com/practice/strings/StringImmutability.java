package com.practice.strings;

public class StringImmutability {//🔐 1. SECURITYUsed in passwords
    public static void main(String[] args) {//🧵 2. THREAD SAFETY:Same string used by many threads
        String s = "java";
        //💾 3. STRING CONSTANT POOL SAVES MEMORY:Same value → same object
        // concat() creates a NEW string
        s = s.concat("world");
        //⚡ 4. HASHCODE CACHING:used in hashmap,hashset
        System.out.println(s); // Output: javaworld
    }
}
