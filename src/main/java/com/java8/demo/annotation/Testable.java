package com.java8.demo.annotation;

import org.junit.Test;

/**
 * @Author: tyk
 * @Date: 2019/9/30 15:12
 * @Description:
 */
public class Testable {
    public void execute() {
        System.out.println("Execute......");
    }

    @Test
    public void testExecute() {
        execute();
    }
}
