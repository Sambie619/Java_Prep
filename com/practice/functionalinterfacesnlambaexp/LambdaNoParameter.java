package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface NormalDemoInterface{
    double getPiValue();
}
public class LambdaNoParameter {
    public static void main(String[] args) {
        NormalDemoInterface nd=()->3.14; // lambda expression
        NormalDemoInterface ndd=()->3.14;
        System.out.println("Value of Pi = " + nd.getPiValue());
        System.out.println("Value of Pi = " + ndd.getPiValue());
    }
}
