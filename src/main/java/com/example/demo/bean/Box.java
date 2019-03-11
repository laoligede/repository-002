package com.example.demo.bean;

/**
 * @author tong.li
 * @date 2019/2/21 11:06
 */
public class Box<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
