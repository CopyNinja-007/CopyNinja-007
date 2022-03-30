package com.learn.exception;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 8:26
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class LoginException extends RuntimeException {
    public LoginException() {
        super();
    }

    public LoginException(String message) {
        super(message);
    }
}
