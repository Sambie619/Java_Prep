package com.practice.test;

class Singletonn {
    private static Singletonn instance;
    private Singletonn(){}//private constructor 
    public static Singletonn getinstance(){//method to get obj
        if (instance==null)instance=new Singletonn();
        return instance;
    }
     public void show() {
        System.out.println("Singleton instance created");
    }
}
class Singleton{
    public static void main(String[] args) {
        Singletonn s1=Singletonn.getinstance();
        Singletonn s2=Singletonn.getinstance();
        s1.show();
        System.out.println(s1 == s2); // true
    }
}

