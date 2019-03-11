package com.example.demo.impl;

import com.example.demo.api.Java8Api;
import org.springframework.stereotype.Service;

/**
 * @author tong.li
 * @date 2019/1/28 17:43
 */
@Service
public class Java8ApiImpl implements Java8Api {


    @Override
    public String haohaiyou() {
        return "好海鸥";
    }
}
