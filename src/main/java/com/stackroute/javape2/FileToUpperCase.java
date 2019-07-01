package com.stackroute.javape2;

import java.io.*;

public class FileToUpperCase {
    public String filetoUpperCase()throws Exception
    {
        File file = new File("/home/suchita/javaprojectpe2/src/main/java/com/stackroute/javape2/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String str="";
        while ((st = br.readLine()) != null) {
//            System.out.println(st);
            str=str+st;
        }
        String str1=str.toUpperCase();
        int len=str.length();
        String numberAsString = Integer.toString(len);
        return "\n" + str1 + "\n" + numberAsString;
    }
}
