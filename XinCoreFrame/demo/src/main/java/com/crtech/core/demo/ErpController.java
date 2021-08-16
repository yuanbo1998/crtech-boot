package com.crtech.core.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * desc
 *
 * @Author: TYP
 * @Date: 2021-08-13 13:45
 */

@Controller
@ResponseBody
@RequestMapping("/erp")
public class ErpController {

    @PostMapping("/test")
    public String test() {
        System.out.println("hello demo!");
        return "success";
    }
}
