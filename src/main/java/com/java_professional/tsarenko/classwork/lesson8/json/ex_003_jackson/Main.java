package com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson;


import com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson.parser.JacksonParser;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("https://gorest.co.in/public-api/users");
    }
}
