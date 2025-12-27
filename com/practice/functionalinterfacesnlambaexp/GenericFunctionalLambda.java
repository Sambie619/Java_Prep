package com.practice.functionalinterfacesnlambaexp;
interface GenericMyInterface<T>{
    T method(T t);// abstract method
}
public class GenericFunctionalLambda  {
    public static void main(String[] args) {
        //lambda for str reverse
        GenericMyInterface<String>reverseString=(str)->{
            return new StringBuilder(str).reverse().toString();
        };
        System.out.println("Lambda reversed = " +reverseString.method("Sabin"));
        //Lambda for Integer Factorial
        GenericMyInterface<Integer>factorial=(num)->{
            int n=1;
            for(int i=1;i<=num;i++){
                n*=i;
            }return n;
        };
        System.out.println("Integer factorial = " +factorial.method(5));
        //Lambda for Integer Reverse
        GenericMyInterface<Integer>reverseInteger=(n)->{
            int rev=0;
            while(n!=0){
                rev=rev*10+n%10;
                n/=10;
            }return rev;
        };
        System.out.println("Integer reverse = " +reverseInteger.method(123));
    }
}
