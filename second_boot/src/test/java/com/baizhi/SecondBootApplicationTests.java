package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.Person2Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecondBootApplicationTests {
    @Autowired
    private UserDao userDao;
    @Autowired
    private Person2Service person2Service;

    @Test
    public void contextLoads() {
        System.out.println(userDao.getCount());
    }
    @Test
    public void test1() {
        System.out.println(person2Service.selectPerson2(null));
    }

}
