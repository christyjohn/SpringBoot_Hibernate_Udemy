package com.christyjohn.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    @Before("com.christyjohn.aopdemo.aspect.MyAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
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
