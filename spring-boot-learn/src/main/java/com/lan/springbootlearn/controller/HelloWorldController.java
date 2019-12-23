package com.lan.springbootlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxinping
 * @Date 2019-11-27
 */
@RestController
@RequestMapping("login")
public class HelloWorldController {

    @RequestMapping("sayhello")
    public Object sayHello() {
        return "Hello world!";
    }
}
