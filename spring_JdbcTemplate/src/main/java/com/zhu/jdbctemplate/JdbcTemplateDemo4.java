package com.zhu.jdbctemplate;

import com.zhu.dao.IAccountDao;
import com.zhu.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * JdbcTemplate在DAO中的使用
 */
public class JdbcTemplateDemo4 {

    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountDao accountDao = ac.getBean("accountDao",IAccountDao.class);

        Account account = accountDao.findAccountById(1);
        System.out.println(account);

        account.setMoney(30000f);
        accountDao.updateAccount(account);
    }
}
