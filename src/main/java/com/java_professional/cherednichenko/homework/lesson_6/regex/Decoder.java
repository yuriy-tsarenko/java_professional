package com.java_professional.cherednichenko.homework.lesson_6.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\java_professional\\cherednichenko\\"
                + "homework\\lesson_6\\regex\\File.txt");
        saveToFile(file, decoderString(readFromFile(file)));
    }

    public static StringBuilder readFromFile(File file) {
        StringBuilder strBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter(System.getProperty("line.separator"));
            while (scanner.hasNext()) {
                strBuilder.append(scanner.next()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strBuilder;
    }

    public static StringBuilder decoderString(StringBuilder stringBuilder) {
        StringBuilder newStrBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("(?<!\\S)(?:это|как|так|и|в|над|к|до|не|на|но|за|то|с|ли|а|во|от|со|для|о|же|"
                + "ну|вы|бы|что|кто|он|она)(?!\\S)");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            matcher.appendReplacement(newStrBuilder, "Java");
        }
        matcher.appendTail(newStrBuilder);
        return newStrBuilder;
    }

    public static void saveToFile(File file, StringBuilder stringBuilder) {
        try (FileOutputStream fileOutputStream = new FileOutputStream((file))) {
            fileOutputStream.write(stringBuilder.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
