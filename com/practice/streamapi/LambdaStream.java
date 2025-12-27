package com.practice.streamapi;
import java.util.List;

public class LambdaStream{

    static List<String> getPlaces(){
        return List.of(
                "Australia, Melbourne",
                "Australia, Sydney",
                "India, Kerala",
                "India, Tamil Nadu",
                "India, Delhi",
                "USA, New York"
        );
    }
    public static void main(String[] args) {
        System.out.println("Places from India:");
        getPlaces().stream().filter(s->s.startsWith("India"))
                        .map(String::toUpperCase)//lamda do s -> s.toUpperCase()
                        .sorted()
                        .forEach(System.out::println);//s -> System.out.println(s)
    }
}
