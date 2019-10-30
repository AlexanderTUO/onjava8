package com.java8.demo.file;

import java.io.*;

/**
 * @Author: tyk
 * @Date: 2019/10/10 15:07
 * @Description:
 */
public class FileTest {

    public static void main(String[] args){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("classpath:template/用车台账明细模板.xlsx"));
//            inputStream = new FileInputStream(new File("E:\\goodgoodstudy\\用车台账明细模板.xlsx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
