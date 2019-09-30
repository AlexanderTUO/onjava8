package com.java8.demo.gc;

import com.java8.demo.entity.BookEntity;
import com.java8.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: tyk
 * @Date: 2019/9/30 09:51
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookTest {
    @Autowired
    private BookService bookService;

    @Test
    public void queryBooks() {
        List<BookEntity> books = bookService.queryAll();
        System.out.println(books);
    }
}
