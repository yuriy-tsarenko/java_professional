package com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson.parser;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson.entity.Response;

import java.io.IOException;
import java.net.URL;


public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Response response = objectMapper.readValue(new URL(url), Response.class);

        System.out.println(response);

        String responseAsString = objectMapper.writeValueAsString(response);

        System.out.println(responseAsString);
    }
}
