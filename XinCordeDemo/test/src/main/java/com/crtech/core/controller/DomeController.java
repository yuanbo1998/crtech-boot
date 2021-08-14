package com.crtech.core.controller;

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
@RequestMapping("/demo")
public class DomeController {

    @PostMapping("/test")
    public String test(){
        System.out.println("success");
        return "success";
    }
}
