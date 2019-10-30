package com.java8.demo.proxy.jdk;

import com.java8.demo.proxy.bean.Logger;
import com.java8.demo.proxy.bean.Privilege;
import com.java8.demo.proxy.bean.Security;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: tyk
 * @Date: 2019/10/9 14:40
 * @Description:
 */
public class SalaryTest {
    @Test
    public void test() {
        Logger logger = new Logger();
        Privilege privilege = new Privilege();
        Security security = new Security();
        Object target = new SalaryManagerImpl();

        JdkSalaryProxy proxy = new JdkSalaryProxy(logger,security,  privilege, new SalaryManagerImpl());
        proxy.showSalary();

        SalaryInterceptor interceptor = new SalaryInterceptor(logger, security, privilege, target);
        SalaryManager proxy1 = (SalaryManager) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
        proxy1.showSalary();
    }
}
