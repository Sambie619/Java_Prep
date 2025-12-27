package com.practice.functionalinterfacesnlambaexp;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample{
    public static void main(String[] args) {
        List<String>cars=new ArrayList<>();
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Bently");
        System.out.println("Printing using lambda...");
        cars.forEach(car->System.out.println(car));
        System.out.println("Using Method Reference:");
        cars.forEach(System.out::println);
        //Take the println method from the System.out object and use it as a Consumer
        //(value) -> System.out.println(value)

    }
}
