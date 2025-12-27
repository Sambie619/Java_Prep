package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface B{
    void add(int x,int y);
}
class Addition{
    public void sum(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
}
public class InstanceMethodReference{
    public static void main(String[] args) {
        Addition add=new Addition();//obj req here instmethref
        B b1=(x,y)->System.out.println("Sum is : "+(x+y));//using lambda
        b1.add(10,45);
        B b2=add::sum;//meth ref (add) is obj
        b2.add(23, 24);
    }
}
