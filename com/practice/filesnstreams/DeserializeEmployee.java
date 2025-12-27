package com.practice.filesnstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee  {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("com/practice/filesnstreams/obj2byte.txt"));
            Employee emp=(Employee) in.readObject();
            System.out.println(emp.id + " " + emp.name);
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
