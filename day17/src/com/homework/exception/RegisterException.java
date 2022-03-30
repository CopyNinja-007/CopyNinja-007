package com.homework.exception;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/30 11:29
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class RegisterException extends Exception {
    private String msg;
    private String code;

    public RegisterException() {
        super();
    }

    public RegisterException(String code,String message) {
        this.msg = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return "错误代码:" + code + "异常信息:" + msg;
    }


}
