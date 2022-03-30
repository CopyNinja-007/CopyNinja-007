package com.homework.model;

import com.homework.exception.AccountBalanceException;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 14:58
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Account {
    private double balance;

    public Account(double balance) throws AccountBalanceException{
        if (balance < 1) {
            throw new AccountBalanceException("余额初始值不能小于1元");
        }else
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void takeMoney(double balance) throws AccountBalanceException{
        double tempBalance = this.balance-balance;
        if (tempBalance < 1) {
            throw new AccountBalanceException("余额不足");
        }else {
            this.balance = tempBalance;
        }
    }

}
