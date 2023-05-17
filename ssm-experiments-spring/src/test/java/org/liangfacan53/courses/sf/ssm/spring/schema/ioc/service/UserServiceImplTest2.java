package org.liangfacan53.courses.sf.ssm.spring.schema.ioc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.liangfacan53.courses.sf.ssm.spring.annotation.ioc.IocAppConfig;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.liangfacan53.courses.sf.ssm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = IocAppConfig.class)    //通过注解的方式
class UserServiceImplTest2 {

    @Autowired
    private UserService userService;

    @Test
    void updateUserById() {
        User user = new User("张三", "abcdefg");
        assertThat(userService.updateUserById(user, 1), is(true));
    }

    @Test
    void updateUserByIdAnnotion() {
        User user = new User("张三", "abcdefg");
        assertThat(userService.updateUserById(user, 1), is(true));
    }

}

