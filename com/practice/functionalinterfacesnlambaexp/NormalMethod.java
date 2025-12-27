package com.practice.functionalinterfacesnlambaexp;
interface NormalDemoInterface {
    double getPiValue();
}
public class NormalMethod implements NormalDemoInterface{
    public double getPiValue(){
        return 3.14;
    }
    public static void main(String[] args) {
        NormalMethod nm=new NormalMethod();
        System.out.println(nm.getPiValue());
    }
}
