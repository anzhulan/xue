package com.lan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author lanxinping
 * @Date 2019-12-13
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("hello")
    public String Hello() {
        return "hello";
    }

    @RequestMapping("success")
    public String success(Map<String,Object> map) {
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五","赵六"));
        return "success";
    }
}
