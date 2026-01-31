package com.christyjohn.aopdemo.aspect;

import com.christyjohn.aopdemo.data.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    @Before("com.christyjohn.aopdemo.aspect.MyAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        System.out.println("\n=====>>> Executing @Before advice on method");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method: " + methodSignature);

        // display method arguments

        // get args
        Object[] args = theJoinPoint.getArgs();

        // loop thru args
        for (Object tempArg : args) {
            System.out.println(tempArg);

            if (tempArg instanceof Account) {

                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }
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
