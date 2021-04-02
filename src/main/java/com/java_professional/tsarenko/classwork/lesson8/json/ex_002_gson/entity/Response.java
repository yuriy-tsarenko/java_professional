package com.java_professional.tsarenko.classwork.lesson8.json.ex_002_gson.entity;

import lombok.ToString;

import java.util.List;

@ToString
public class Response {
    private int code;
    private List<User> data;
}
