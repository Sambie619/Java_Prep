package com.practice.jdknewfeatures;

class GenericType<T>{
    private T t;
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}
public class TestGenericClass  {

    public static<T> boolean isGenericTypeSame(GenericType<T> g1,GenericType<T> g2){
        return g1.get().equals(g2.get());
    }
    public static void main(String[] args) {
        
        GenericType<Integer>g1=new GenericType<>();
        g1.set(23);
        System.out.println(g1.get());
        GenericType<Integer>g2=new GenericType<>();
        g2.set(23);
        System.out.println(g2.get());
        System.out.println(isGenericTypeSame(g1, g2));
    }
}
