package com.java_professional.varycheva.homework.hw4.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WorkWithFile {

    public static void createAndWriteFile(String filename, String data) {
        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            writer.write(data);
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    public static StringBuilder readFile(File file) {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
        return resultStringBuilder;
    }
}
