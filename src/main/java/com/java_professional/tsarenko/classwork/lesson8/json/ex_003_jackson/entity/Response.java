package com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.List;

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    @JsonProperty("code")
    private int code;

    @JsonProperty("data")
    private List<User> data;

    @JsonCreator
    public Response(
            @com.fasterxml.jackson.annotation.JsonProperty("code") int code,
            @com.fasterxml.jackson.annotation.JsonProperty("data") List<User> data) {
        this.code = code;
        this.data = data;
    }
}
