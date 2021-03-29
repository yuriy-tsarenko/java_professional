package com.java_professional.cherednichenko.homework.lesson_8.JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().serializeNulls().create();
        Path path = Paths.get("src\\main\\java\\com\\java_professional\\cherednichenko\\homework\\lesson_8\\JSON\\package.json").toAbsolutePath();
        FileInputStream inputStream = new FileInputStream(path.toString());
        byte[] bytes = inputStream.readAllBytes();
        String json = new String(bytes);
        //   System.out.println(json);
        Response response = gson.fromJson(json, Response.class);
        for (Data data : response.getData()) {
            data.setDescription("Some description");
        }
        System.out.println(response);
    }
}
