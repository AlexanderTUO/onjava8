package com.java8.demo.proxy.jdk;

/**
 * @Author: tyk
 * @Date: 2019/10/9 14:19
 * @Description:
 */
public class SalaryManagerImpl implements SalaryManager {
    @Override
    public void showSalary() {
        System.out.println("正在查看工资，哦哦，涨了2w");
    }
}
