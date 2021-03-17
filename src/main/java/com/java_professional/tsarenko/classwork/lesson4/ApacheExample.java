package com.java_professional.tsarenko.classwork.lesson4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class ApacheExample {
    public static void main(String[] args) {
        try {
            work();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void work() throws IOException {
        File file = FileUtils.getFile("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\"
                + "java_professional\\tsarenko\\classwork\\lesson4\\readingFile\\example.txt");
        File dir = new File("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\"
                + "java_professional\\" + "tsarenko\\classwork\\lesson4");
        FileUtils.copyFileToDirectory(file, dir);
        String data = FileUtils.readFileToString(file, Charset.defaultCharset());
        System.out.println(data);
    }

}
