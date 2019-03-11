package com.example.demo.api;

/**
 * @author tong.li
 * @date 2019/2/19 16:29
 */
@FunctionalInterface
public interface IConvert<F,T> {
    T convert(F from);
}
