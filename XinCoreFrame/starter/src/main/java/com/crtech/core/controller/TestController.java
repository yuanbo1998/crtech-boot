package com.crtech.core.controller;

import org.jeecg.modules.demo.test.mapper.JoaDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * desc
 *
 * @Author: TYP
 * @Date: 2021-08-12 10:53
 */

@Controller
@ResponseBody
@RequestMapping("/test")
public class TestController {

    @PostMapping("/connect")
    public String test() {
        System.out.println("hello world!");
        return "connected!";
    }

    @Autowired
    private JoaDemoMapper joaDemoMapper;

    @PostMapping("/query")
    public String query() {
        Integer count = joaDemoMapper.selectCount(null);
        System.out.println("count ==> " + count);
        return "query success,result ==> " + count;
    }
}
