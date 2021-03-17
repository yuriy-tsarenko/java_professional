package com.java_professional.tsarenko.classwork.lesson4.ex_003_ioStream.io_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true)) {
            //true – означает, что после вызова pw.println(…) можно не вызывать pw.flush().
            String s = "Hello world";
            System.out.println("System.out works: " + s);
            pw.println("PrintWriter works: " + s);

            char c;
            pw.println("Chars out: ");
            while ((c = (char) bufferedReader.read()) != 'q') {
                pw.println(c);
            }

            pw.println("Line out:");
            do {
                s = bufferedReader.readLine();
                pw.println(s);
            } while (!s.equals("q"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

