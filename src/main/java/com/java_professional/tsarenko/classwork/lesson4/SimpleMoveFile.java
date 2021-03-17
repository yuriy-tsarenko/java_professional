package com.java_professional.tsarenko.classwork.lesson4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\java_professional\\tsarenko\\classwork\\lesson4\\SimpleByteArrayInputStream.java");
        File targetFile = new File("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\java_professional\\tsarenko\\classwork\\lesson4\\readingFile\\SimpleByteArrayInputStream.java");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
