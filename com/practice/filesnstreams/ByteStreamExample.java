package com.practice.filesnstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample{
     public static void main(String[] args) {
try{
    FileInputStream fis=new FileInputStream("C:/Users/acer/Desktop/Jprep/com/practice/filesnstreams/bytestreams.txt");
    FileOutputStream fos=new FileOutputStream("com/practice/filesnstreams/bytestreamsout.txt");
    int bytedata;
    while((bytedata=fis.read())!=-1){
        fos.write(bytedata);
    }
    System.out.println("File copied successfully.");
    fis.close();
    fos.close();//close streams  
}
catch(IOException e){
    e.printStackTrace();
}
System.out.println("after i/o operation...");
}
}