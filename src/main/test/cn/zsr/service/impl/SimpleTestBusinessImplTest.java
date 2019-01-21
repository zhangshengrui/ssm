package cn.zsr.service.impl;

import cn.zsr.service.SimpleTestBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SimpleTestBusinessImplTest {

    @Autowired
    private SimpleTestBusiness business;


    @Test
    public void test1() throws Exception {
        System.out.println(business.test());
    }

}