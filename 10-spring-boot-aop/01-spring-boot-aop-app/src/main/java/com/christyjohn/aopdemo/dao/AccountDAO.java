package com.christyjohn.aopdemo.dao;

import com.christyjohn.aopdemo.data.Account;

import java.util.List;

public interface AccountDAO {

    //void addAccount();

    //void addAccount(Account theAccount);

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

    // add a new method: findAccounts()
    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);
}
