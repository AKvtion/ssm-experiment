package org.liangfacan53.courses.sf.ssm.spring.annotation.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);

    @Pointcut("execution(* org.liangfacan53.courses.sf.ssm.spring.annotation.aop.AopDemo.*(..))")
    private void pointCutMethod() {
    }

    @Before("pointCutMethod()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("before method: " + methodName);
    }

    @After("pointCutMethod()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("after(finally) method: " + methodName);
    }


    @AfterReturning(pointcut = "pointCutMethod()", returning = "result")
    public void afterMethodReturning(JoinPoint joinPoint, String result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("after returning method: " + methodName + " with return value: " + result);
    }

    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "exception")
    public void afterMethodThrowing(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("after throwing method: " + methodName + " with throwing message " + exception.getMessage());
    }

    @Around("pointCutMethod()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        logger.info("around-before method: " + methodName);
        Object ret = proceedingJoinPoint.proceed();
        logger.info("around-after method: " + methodName);
        return ret;
    }
}
