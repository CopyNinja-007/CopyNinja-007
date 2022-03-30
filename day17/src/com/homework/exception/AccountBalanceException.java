package com.homework.exception;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 14:57
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class AccountBalanceException extends RuntimeException {
    public AccountBalanceException() {
    }

    public AccountBalanceException(String message) {
        super(message);
    }
}
