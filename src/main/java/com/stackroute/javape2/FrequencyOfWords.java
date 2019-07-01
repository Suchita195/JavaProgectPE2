package com.stackroute.javape2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    public Map countWords() {
// Declare the HashMap
        Map< String,Integer> hashMap = new HashMap< String,Integer>();
        try {
            String line;
            FileReader reader = new FileReader("/home/suchita/javaprojectpe2/src/main/java/com/stackroute/javape2/FileDemo.txt");
            BufferedReader br = new BufferedReader(reader);

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
               String[] words = line.split("\\s+|,|\\.|;");
               for(String word : words)
               {
                   if(hashMap.containsKey(word)) {
                       Integer count = hashMap.get(word);
                       hashMap.put(word, ++count);
                   }
                   else
                   {
                       hashMap.put(word,1);
                   }
               }
               line=br.readLine();


            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I could'nt read your files:" + e);
        }
        return null;
    }
}

