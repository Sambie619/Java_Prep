package com.practice.filesnstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimitiveInputBufferedReader {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        int intVal=Integer.parseInt(br.readLine());
        float floatVal = Float.parseFloat(br.readLine());
        double doubleVal = Double.parseDouble(br.readLine());
        char charVal=br.readLine().charAt(0);
        boolean boolVal = Boolean.parseBoolean(br.readLine());
        String stringVal = br.readLine();
        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(charVal);
        System.out.println(boolVal);
        System.out.println(stringVal);}
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
