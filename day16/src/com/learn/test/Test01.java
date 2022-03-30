package com.learn.test;

import com.learn.model.Bus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/3/29 13:29
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test01 {
    public static void main(String[] args) {
        Bus bus = new Bus();

    }


}

class MyException extends RuntimeException {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
