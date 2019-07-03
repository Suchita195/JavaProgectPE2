package com.stackroute.javape2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.Files.readAllBytes;

public class DisplayFilesInAFolder {
    public String findFiles() throws IOException {
        String output = "";
        File file = new File("/home/suchita/javaprojectpe2/src/main/java/com/stackroute/javape2");

        File[] listOfFiles = file.listFiles();
        // loop to list all the files in the folder

        for (int index = 0; index < listOfFiles.length; index++) {
            if (listOfFiles[index].isFile()) {
                System.out.println("File " + listOfFiles[index].getName());
            } else if (listOfFiles[index].isDirectory()) {
                System.out.println("Directory " + listOfFiles[index].getName());
            }

        }
        Path path = Paths.get("/home/suchita/javaprojectpe2/src/main/java/com/stackroute/javape2/file.txt");//read contents of file with this extention
        byte[] data = readAllBytes(path);
        return output.trim() + "\n" + new String(data).trim();//return the content of the file
    }
}