package com.christyjohn.aopdemo.dao;

import com.christyjohn.aopdemo.data.Account;

public interface AccountDAO {

    //void addAccount();

    //void addAccount(Account theAccount);

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
