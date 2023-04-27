package org.liangfacan53.courses.sf.ssm.spring.schema.ioc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.liangfacan53.courses.sf.ssm.spring.annotation.ioc.IocAppConfig;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.liangfacan53.courses.sf.ssm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@ExtendWith(SpringExtension.class)
//@SpringJUnitConfig(locations = "classpath:schema/iocDemoContext.xml")   //通过xml方式
@SpringJUnitConfig(classes = IocAppConfig.class)
class UserServiceImplTest {

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

