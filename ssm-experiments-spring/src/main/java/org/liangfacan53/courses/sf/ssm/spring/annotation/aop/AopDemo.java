package org.liangfacan53.courses.sf.ssm.spring.annotation.aop;

import org.springframework.stereotype.Component;

@Component
public class AopDemo {
    public void method01() {
        System.out.println("in method01...");
    }

    public String method02() {
        System.out.println("in method02...");
        return "hello from method2...";
    }

    public void method03() throws Exception {
        System.out.println("in method03...");
        throw new Exception("exception throws by method03...");
    }
}
