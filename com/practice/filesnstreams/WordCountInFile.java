package com.practice.filesnstreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile{
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try(BufferedReader br=new BufferedReader(new FileReader("com/practice/filesnstreams/mydocumentfile.txt"))){
            String line;
            while((line=br.readLine())!=null){
                lineCount++;
                String[]words=line.split(" ");
                wordCount+=words.length;
                for(String word :words){
                    charCount+=word.length();
                }
            }
            System.out.println(charCount);
            System.out.println(wordCount);
            System.out.println(lineCount);

           
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
