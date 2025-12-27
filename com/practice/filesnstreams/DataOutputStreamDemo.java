package com.practice.filesnstreams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo  {
    public static void main(String[] args) {
        try {
            FileOutputStream f=new FileOutputStream("com/practice/filesnstreams/dataopstream.txt");
            DataOutputStream data=new DataOutputStream(f);//wrap to wrt in binary to fle
            try {
                data.writeInt(65);
                data.flush();
                data.close();
            } catch (IOException e) {
                e.printStackTrace();
            }    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
