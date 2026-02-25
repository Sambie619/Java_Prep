package com.practice.filesnstreams;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee{
    public static void main(String[] args) {
        try{//obj to bytestream
            Employee emp=new Employee(59, "Sabin");
            FileOutputStream f=new FileOutputStream("com/practice/filesnstreams/obj2byte.txt");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(emp);
            o.close();
            System.out.println("Object saved");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
