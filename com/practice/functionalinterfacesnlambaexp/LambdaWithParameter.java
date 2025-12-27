package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface MyInterface{
    String reverse(String s);
}
public class LambdaWithParameter  {
    public static void main(String[] args) {
        MyInterface mi=(String s)->{
            char[]arr=s.toCharArray();
            int l=0,r=arr.length-1;
            while(l<r){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;r--;
            }return new String(arr);
            //or MyInterface mi = s -> new StringBuilder(s).reverse().toString();
        };
        System.out.println(
            "String reversed = " + mi.reverse("Luminar")
        );
    }
}
