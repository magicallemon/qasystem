package com.springboot.qa.qasystem;

import com.springboot.qa.qasystem.model.User;
import com.springboot.qa.qasystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class QasystemApplicationTests {

    @Resource
    UserService userService;


    @Test
    void contextLoads() {
        User user = userService.findUserByUserNameAndPassword("admin","admin");
        System.out.println("该用户ID为：");
        System.out.println(user.getId());
    }

}
