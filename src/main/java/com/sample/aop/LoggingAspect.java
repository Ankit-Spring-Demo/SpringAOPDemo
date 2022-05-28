package com.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.sample.service.ShoppingCart.checkout(..))")
    public void beforeLog(JoinPoint jp) {
        System.out.println(jp.getArgs()[0]);
        System.out.println("Before Print Log");
    }

    @After("execution(* com..*(..))")
    public void afterLog() {
        System.out.println("After Print Log");
    }

    @AfterReturning(returning = "value")
    public void afterReturningLog(String value) {
        System.out.println("After Print Log");
    }
}
