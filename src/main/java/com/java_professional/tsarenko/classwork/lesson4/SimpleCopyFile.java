package com.java_professional.tsarenko.classwork.lesson4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleCopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\"
                + "java_professional\\tsarenko\\classwork\\lesson4\\readingFile\\example.txt");
        File targetFile = new File("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\"
                + "java_professional\\tsarenko\\classwork\\lesson4\\example.txt");

        try {
            if (!targetFile.exists()) {
                Files.copy(sourceFile.toPath(), targetFile.toPath());
            } else {
                System.out.println("target file exists!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
