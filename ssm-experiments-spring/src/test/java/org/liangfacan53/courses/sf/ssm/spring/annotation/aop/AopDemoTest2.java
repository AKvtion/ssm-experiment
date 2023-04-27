package org.liangfacan53.courses.sf.ssm.spring.annotation.aop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = AopAppConfig.class)
class AopDemoTest2 {

    @Autowired
    AopDemo aopDemo;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void method01() {
        aopDemo.method01();
        assertThat("always pass", anything());
    }

    @Test
    void method02() {
        aopDemo.method02();
        assertThat("always pass", anything());
    }

    @Test
    void method03() {
        assertThrows(Exception.class, () -> aopDemo.method03());
    }
}
