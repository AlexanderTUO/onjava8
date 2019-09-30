package com.java8.demo.service;

import com.java8.demo.dao.BookDao;
import com.java8.demo.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: tyk
 * @Date: 2019/9/30 09:50
 * @Description:
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<BookEntity> queryAll() {
        return bookDao.queryAll();
    }
}
