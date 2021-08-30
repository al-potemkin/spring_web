package com.potemkin.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

    @RequestMapping("/")
    public String first(){
        return "firstView";
    }

    @RequestMapping("showSecond")
    public String second(){
        return "secondView";
    }

}
