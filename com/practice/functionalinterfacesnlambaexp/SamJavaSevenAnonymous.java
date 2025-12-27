package com.practice.functionalinterfacesnlambaexp;
interface NormalDemoInterface{
    double getPiValue();
}
public class SamJavaSevenAnonymous {
    public static void main(String[] args) {
    NormalDemoInterface ndi=new NormalDemoInterface() {
        @Override
        public double getPiValue(){
        return 3.14;
    }
    };
    System.out.println(ndi.getPiValue());
    }
}
