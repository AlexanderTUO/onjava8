package com.java8.demo.proxy.jdk;

import com.java8.demo.proxy.bean.Logger;
import com.java8.demo.proxy.bean.Privilege;
import com.java8.demo.proxy.bean.Security;

/**
 * @Author: tyk
 * @Date: 2019/10/9 14:16
 * @Description:
 */
public class JdkSalaryProxy implements SalaryManager{
    private Logger logger;
    private Privilege privilege;
    private Security security;

    private SalaryManager target;

    public JdkSalaryProxy() {
    }

    public JdkSalaryProxy(Logger logger, Security security, Privilege privilege, SalaryManager target) {
        this.logger = logger;
        this.privilege = privilege;
        this.security = security;
        this.target = target;
    }

    @Override
    public void showSalary() {
        this.logger.logging();
        this.security.security();
        this.privilege.setAccesss("admin");
        if ("admin".equals(this.privilege.getAccesss())) {
            this.target.showSalary();
        } else {
            System.out.println("你没有权限");
        }
    }
}
