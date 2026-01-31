package com.christyjohn.aopdemo.dao;

import com.christyjohn.aopdemo.data.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    /*@Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT 1 ");
    }

    @Override
    public void addAccount(Account theAccount) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT 2 ");
    }*/

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT 3");
    }

    @Override
    public boolean doWork() {

        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
