package com.java8.demo.dao;

import com.java8.demo.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: tyk
 * @Date: 2019/9/30 09:50
 * @Description:
 */
@Mapper
public interface BookDao {
    List<BookEntity> queryAll();
}
