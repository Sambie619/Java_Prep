package com.practice.filesnstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample{
    public static void main(String[]args){
        try(FileReader fr=new FileReader("com/practice/filesnstreams/charstream.txt");
    FileWriter fw=new FileWriter("com/practice/filesnstreams/charstreamout.txt")){
            int chardata;
            while((chardata=fr.read())!=-1){
                fw.write(chardata);
            }
            System.out.println("Text copied successfully.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
