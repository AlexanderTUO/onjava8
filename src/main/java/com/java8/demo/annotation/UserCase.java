package com.java8.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: tyk
 * @Date: 2019/9/30 15:25
 * @Description:追踪项目中的用例：
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserCase {
    int id();

    String description() default "no description";

}
