package com.practice.varargpack;
import  static java.lang.Math.*;
public class VarargsExample  {//one meth any no:args
    static void printnums(int...nums){
        for (int i : nums) {
            System.out.print(i + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        printnums(1,2,3,4,5);
        printnums(2,3,4,5);
        //System.out.println(sqrt(4));err cause sqrt is static meth of java.lang.Math
        //import it first and call classname.sqrt or do static import 
        //if you wanna simply call sqrt
        System.out.println(sqrt(4));
        
    }
}
