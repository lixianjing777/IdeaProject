package com.fred;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String  protal(){
        //将逻辑试图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String cc(){
        return "success";
    }

}
