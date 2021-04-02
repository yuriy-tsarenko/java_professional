package com.java_professional.diledsys.homework.reflexion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnteringData {

    public static String input(String coment) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(coment + " ");
        try {
            return bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
