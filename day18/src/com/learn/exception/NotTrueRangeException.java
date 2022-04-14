package com.learn.exception;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/31 11:01
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class NotTrueRangeException extends RuntimeException{

    public NotTrueRangeException() {
        super();
    }

    public NotTrueRangeException(String message) {
        super(message);
    }
}
