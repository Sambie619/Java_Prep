package com.practice.filesnstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamExample{
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("com/practice/filesnstreams/bytestreams.txt"));
    BufferedWriter bw=new BufferedWriter(new FileWriter("com/practice/filesnstreams/buffstreamsout.txt"))){
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
            }
            
            System.out.println("Buffered copy completed.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
