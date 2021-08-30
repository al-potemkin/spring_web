package com.potemkin.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SpringController {

    @RequestMapping("/")
    public String first(){
        return "firstView";
    }

    @RequestMapping("showSecond")
    public String second(@RequestParam("formValue") String param, Model model){
        model.addAttribute("valuerFromRequest", param);
        return "secondView";
    }

}
