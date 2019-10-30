package com.java8.demo.proxy.normal;

import com.java8.demo.proxy.bean.Logger;
import com.java8.demo.proxy.bean.Privilege;
import com.java8.demo.proxy.bean.Security;

/**
 * @Author: tyk
 * @Date: 2019/10/9 09:45
 * @Description:
 */
public class SalaryManager {
    private Logger logger;
    private Security security;
    private Privilege privilege;

    public SalaryManager() {
    }

    public SalaryManager(Logger logger,Security security,Privilege privilege) {
        this.logger = logger;
        this.privilege = privilege;
        this.security = security;
    }

    public void showSalary() {
        this.logger.logging();
        this.security.security();
        if ("admin".equals(this.privilege.getAccesss())) {
            System.out.println("工资涨了10w");
        } else {
            System.out.println("你没有访问权限");
        }
    }
}
