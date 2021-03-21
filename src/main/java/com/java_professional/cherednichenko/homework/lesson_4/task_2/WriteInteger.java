package com.java_professional.cherednichenko.homework.lesson_4.task_2;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

//Задание 3
//        Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию
public class WriteInteger {
    static Logger logger = Logger.getLogger(WriteInteger.class.getName());

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        try (FileWriter writer = new FileWriter("Integer.txt", false)) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                writer.write(String.valueOf(random.nextInt()));
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {

            logger.error(e);
        }

        try {
            arrayList = Files.readAllLines(Paths.get("Integer.txt"), StandardCharsets.UTF_8);
            arrayList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (Integer.parseInt(o1) > Integer.parseInt(o2)) {
                        return 0;
                    }
                    return -1;
                }
            });
        } catch (IOException e) {
            logger.error(e);
        }
        System.out.println(arrayList);
    }
}
