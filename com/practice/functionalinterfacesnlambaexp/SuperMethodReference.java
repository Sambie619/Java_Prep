package com.practice.functionalinterfacesnlambaexp;
interface Base{
    void SayHello();
}
class SuperHello{
    public void superHello(){
        System.out.println("I am inside Super class");
    }
}
public class SuperMethodReference extends SuperHello{
    public void childHello(){
        System.out.println("I am inside sub class");
    }
    public void testHello(){
        Base b1=super::superHello;//sup meth Reference
        b1.SayHello();
        Base b2=()->System.out.println("I am inside Super class");//using lambda
        b2.SayHello();
        Base b3=this::childHello;
        b3.SayHello();
    }
    public static void main(String[] args) {
        SuperMethodReference obj=new SuperMethodReference();
        obj.testHello();
    }
}
