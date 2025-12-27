package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface Test{
    boolean checkEvenNo(int x);
}
class Digit{//utility class
    public static boolean isEven(int x){
        return x%2==0;
    }
}
public class StaticMethodReference {
    public static void main(String[] args) {
        Test t1=(x)->x%2==0;
        System.out.println(t1.checkEvenNo(10));
        Test t=Digit::isEven;//using methref
        System.out.println(t.checkEvenNo(2));
    }
}
