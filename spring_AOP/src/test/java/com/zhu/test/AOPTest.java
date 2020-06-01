package com.zhu.test;

import com.zhu.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:bean.xml")
public class AOPTest {
    @Autowired
    private IAccountService accountService;

    @Test
    public void testService() {
        accountService.saveAccount();
    }
}
