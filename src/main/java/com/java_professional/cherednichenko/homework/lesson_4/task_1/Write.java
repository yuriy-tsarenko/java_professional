package com.java_professional.cherednichenko.homework.lesson_4.task_1;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Задание 2
//        Создайте файл, запишите в него произвольные данные и закройте файл.
//        атем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
public class Write {
    static Logger logger = Logger.getLogger(Write.class.getName());

    public static void main(String[] args) {
        String message = "Создайте файл, запишите в него произвольные данные и закройте файл. "
                + "Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.";
        try (FileOutputStream fileOS = new FileOutputStream("notes.txt")) {
            byte[] buffer = message.getBytes();

            fileOS.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException e) {
            logger.error(e);
        }
        try (FileInputStream fileIS = new FileInputStream("notes.txt")) {
            System.out.printf("File size: %d bytes \n", fileIS.available());

            int i = -1;
            while ((i = fileIS.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException e) {
            logger.error(e);
        }
    }
}

