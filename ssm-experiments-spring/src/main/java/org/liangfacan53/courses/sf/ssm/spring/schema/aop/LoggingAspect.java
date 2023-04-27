package org.liangfacan53.courses.sf.ssm.spring.schema.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("before method: " + methodName);
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("after(finally) method: " + methodName);
    }

    public void afterMethodReturning(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("after returning method: " + methodName);
    }

    public void afterMethodThrowing(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("after throwing method: " + methodName);
    }

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        logger.info("around-before method: " + methodName);
        Object ret = proceedingJoinPoint.proceed();
        logger.info("around-after method: " + methodName);
        return ret;
    }

}
