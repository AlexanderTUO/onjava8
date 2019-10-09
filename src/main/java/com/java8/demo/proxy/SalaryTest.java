package com.java8.demo.proxy;

import com.java8.demo.proxy.bean.Logger;
import com.java8.demo.proxy.bean.Privilege;
import com.java8.demo.proxy.bean.Security;
import org.junit.Test;

/**
 * @Author: tyk
 * @Date: 2019/10/9 09:51
 * @Description:
 */
public class SalaryTest {

    @Test
    public void test() {
        Logger logger = new Logger();
        Security security = new Security();
        Privilege privilege = new Privilege();
        privilege.setAccesss("admin");
        SalaryManager manager = new SalaryManager(logger,privilege, security);
        manager.showSalary();
    }

}
