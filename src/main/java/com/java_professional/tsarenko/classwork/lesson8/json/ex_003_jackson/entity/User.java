package com.java_professional.tsarenko.classwork.lesson8.json.ex_003_jackson.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.Date;

@ToString
public class User {

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("email")
    public String email;

    @JsonProperty("gender")
    public String gender;

    @JsonProperty("status")
    public String status;

    @JsonProperty("created_at")
    public Date createdAt;

    @JsonProperty("updated_at")
    public Date updatedAt;

    @JsonCreator
    public User(
            @com.fasterxml.jackson.annotation.JsonProperty("id") Integer id,
            @com.fasterxml.jackson.annotation.JsonProperty("name") String name,
            @com.fasterxml.jackson.annotation.JsonProperty("email") String email,
            @com.fasterxml.jackson.annotation.JsonProperty("gender") String gender,
            @com.fasterxml.jackson.annotation.JsonProperty("status") String status,
            @com.fasterxml.jackson.annotation.JsonProperty("created_at") Date createdAt,
            @com.fasterxml.jackson.annotation.JsonProperty("updated_at") Date updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
