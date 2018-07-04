package com.zjw.junit;

import com.zjw.dao.UserMapper;
import com.zjw.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zjw on 2018/6/24.
 */

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUsername());
    }

}