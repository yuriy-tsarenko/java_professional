package com.java_professional.varycheva.homework.hw4.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Random;
import java.util.stream.IntStream;

public class FileWithNumbers {

    public static void createAndWriteRandomNumbersToFileWithFormatter(String filename, int countOfNumber) {
        try (Formatter formatter = new Formatter(filename, "UTF-8")) {
            IntStream.range(0, countOfNumber)
                    .forEach(i -> formatter.format("%d%n", new Random().nextInt(1000)));
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    public static void createAndWriteRandomNumbersToFile(String filename, int countOfNumber) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            Random random = new Random();
            for (int i = 0; i <= countOfNumber; i++) {
                writer.write(String.valueOf(random.nextInt(100)));
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    public static void readAndSortNumbers(String filename) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filename), StandardCharsets.UTF_8))) {
            reader.lines().sorted(Comparator.comparingInt(Integer::parseInt)).forEach(System.out::println);
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
}
