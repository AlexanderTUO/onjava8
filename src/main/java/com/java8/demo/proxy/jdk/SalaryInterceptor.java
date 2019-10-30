package com.java8.demo.proxy.jdk;

import com.java8.demo.proxy.bean.Logger;
import com.java8.demo.proxy.bean.Privilege;
import com.java8.demo.proxy.bean.Security;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 1.拦截器的作用
 *
 *
 * @Author: tyk
 * @Date: 2019/10/9 14:57
 * @Description:拦截器
 *
 */
public class SalaryInterceptor implements InvocationHandler {
    private Logger logger;
    private Security security;
    private Privilege privilege;

    private Object target;

    public SalaryInterceptor(Logger logger, Security security, Privilege privilege, Object target) {
        this.logger = logger;
        this.security = security;
        this.privilege = privilege;
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理");
        this.logger.logging();
        this.security.security();
        this.privilege.setAccesss("admin");
        if ("admin".equals(this.privilege.getAccesss())) {
            method.invoke(this.target, args);
        } else {
            System.out.println("你没有权限");
        }
        System.out.println("代理结束");
        return null;
    }
}
