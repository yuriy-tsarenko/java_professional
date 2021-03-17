package com.java_professional.tsarenko.classwork.lesson4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("dataOut.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))) {

            dataOutputStream.writeShort(1200);
            dataOutputStream.writeInt(1111);
            dataOutputStream.writeLong(10L);
            dataOutputStream.writeUTF("Hello World!!!");
            dataOutputStream.flush();

            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
