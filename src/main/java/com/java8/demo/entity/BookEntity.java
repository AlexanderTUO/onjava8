package com.java8.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: tyk
 * @Date: 2019/9/30 09:48
 * @Description:
 */
@Data
public class BookEntity implements Serializable {
    private String id;
    private String name;
    private Integer count;
}
