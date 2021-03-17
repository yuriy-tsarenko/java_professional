package com.java_professional.tsarenko.classwork.lesson4.buffered;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("D:\\IT\\IdeaProjects\\java_professional\\src\\main\\java\\com\\" +
                        "java_professional\\tsarenko\\classwork\\lesson4\\buffered\\Main.java")));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream("D:\\IT\\IdeaProjects\\java_professional\\" +
                             "src\\main\\java\\com\\java_professional\\tsarenko\\classwork\\lesson4\\buffered\\Main2.java")))){

            int c;
            while ((c = br.read()) != -1) {
                bw.write((char) c);
            }
            bw.flush();
            System.out.println("The job's finished.");
        } catch (Exception e) {
            log.error(e);
        }
    }
}
