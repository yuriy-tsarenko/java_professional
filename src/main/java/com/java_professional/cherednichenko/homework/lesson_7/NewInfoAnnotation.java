package com.java_professional.cherednichenko.homework.lesson_7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface NewInfoAnnotation {
    /**
     * This field @return the name of the method
     */
    String name() default "";

    /**
     * This field @return the description of the method
     */
    String description() default "";
}
