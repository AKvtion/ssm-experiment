package org.liangfacan53.courses.sf.ssm.spring.schema.aop;

public class AopDemo {
    public void method01() {
        System.out.println("in method01...");
    }

    public void method02() {
        System.out.println("in method02...");
    }

    public void method03() throws Exception{
        System.out.println("in method03...");
        throw new Exception("exception throws by method03...");
    }

}
