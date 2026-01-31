package com.christyjohn.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging
    // let's start with an @Before advice

    @Pointcut("execution(* com.christyjohn.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }

    /*
    //@Before("execution(public void addAccount())")
    //@Before("execution(public void com.christyjohn.aopdemo.dao.AccountDAO.addAccount())")
    //@Before("execution(public void add*())")
    //@Before("execution(public * add*())")
    //@Before("execution(* add*(com.christyjohn.aopdemo.data.Account))")
    //@Before("execution(* add*(com.christyjohn.aopdemo.data.Account, ..))")
    @Before("execution(* add*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("=====>>> Executing @Before advice on method");
    }
    */
}
