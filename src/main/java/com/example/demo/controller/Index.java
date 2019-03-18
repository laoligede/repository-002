package com.example.demo.controller;

import com.example.demo.impl.Java8ApiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author tong.li
 * @date 2019/1/28 17:18
 */
@RestController
public class Index {
    @Autowired
    private Java8ApiImpl java8Api;

    @RequestMapping("/wechart")
    public void auth(@RequestParam("code") String code) {
        System.out.println("进入auth方法...");
        System.out.println("code = {}"+ code);
    }
    @RequestMapping("/")
    public String auth() {
        return "潘鹏加油,不懂就问^_^!";
    }

}
