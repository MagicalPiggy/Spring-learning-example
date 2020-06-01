package com.zhu.factory;

import com.zhu.service.IAccountService;
import com.zhu.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类
 */
public class InstanceFactory {

    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
