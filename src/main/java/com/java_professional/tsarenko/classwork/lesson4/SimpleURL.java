package com.java_professional.tsarenko.classwork.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class SimpleURL {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://gorest.co.in/public-api/categories");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
