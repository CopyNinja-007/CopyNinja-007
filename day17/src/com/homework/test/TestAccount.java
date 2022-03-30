package com.homework.test;

import com.homework.exception.AccountBalanceException;
import com.homework.model.Account;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 14:57
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestAccount {
    public static void main(String[] args) {
        try {
            Account account = new Account(100);
            System.out.println("卡上余额:" + account.getBalance());
            account.takeMoney(99.5);
            System.out.println("卡上余额:" + account.getBalance());
        } catch (AccountBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
