package org.jeecg.modules.contronller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * desc
 *
 * @Author: TYP
 * @Date: 2021-08-11 10:22
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @PostMapping("/connect")
    @ResponseBody
    public String connect() {
        System.out.println("hello world !");
        return "connected";
    }
}
