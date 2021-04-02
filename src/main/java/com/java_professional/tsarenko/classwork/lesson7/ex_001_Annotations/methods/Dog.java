package com.java_professional.tsarenko.classwork.lesson7.ex_001_Annotations.methods;

// К классу Dog добавится полная информация об аннотации @Mammal в JavaDoc

@Mammal(color = Color.GREY, sound = "Woof")
public class Dog {
    @HasHair(length = 15)
    public void hair() {

    }
}
