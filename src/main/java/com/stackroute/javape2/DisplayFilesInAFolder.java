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

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }

        }
        Path path = Paths.get("/home/suchita/javaprojectpe2/src/main/java/com/stackroute/javape2/file.txt");
        byte[] data = readAllBytes(path);
        return output.trim() + "\n" + new String(data).trim();
    }
}