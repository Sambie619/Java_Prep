package com.practice.filesnstreams;
import java.io.Serializable;
public class Employee implements Serializable{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
