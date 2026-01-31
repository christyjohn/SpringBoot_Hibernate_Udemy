package com.christyjohn.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    /*@Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
    }*/

    @Override
    public boolean addMember() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBER");
        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": I'm going to sleep now...");
    }
}
