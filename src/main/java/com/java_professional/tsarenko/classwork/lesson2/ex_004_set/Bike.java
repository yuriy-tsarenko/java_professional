package com.java_professional.tsarenko.classwork.lesson2.ex_004_set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Bike {

    private String brand;
    private Integer speed;
    private Integer maxDistance;
}
