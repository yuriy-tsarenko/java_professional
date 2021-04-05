package com.java_professional.cherednichenko.homework.lesson_8.JSON;

import lombok.Getter;

import java.util.List;

@Getter
public class Response {
    public int code;
    public List<Data> data;

    @Override
    public String toString() {
        return "Response{"
                + "code=" + code
                + ", data=" + data
                +  '}';
    }
}
