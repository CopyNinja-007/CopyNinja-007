package com.homework.exception;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 11:47
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class UserNotExistsException extends RuntimeException{

    public UserNotExistsException() {
    }

    public UserNotExistsException(String message) {
        super(message);
    }
}
