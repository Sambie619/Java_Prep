package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface Display{
    void getName(String name);//SAM
}
public class MethodReferenceStatic{

    public static void getInfo(String info){
        System.out.println(info);// existing static method
    }
    public static void main(String[] args) {
        // USING LAMBDA
        Display d=(s)->System.out.println("lambda syas : "+s);
        d.getName("SAM getName() is executing");
        // USING METHOD REFERENCE
        Display d1=MethodReferenceStatic::getInfo;
        d1.getName("getInfo() using Method Reference");
    }
}
