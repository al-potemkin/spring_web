package com.potemkin.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SpringController {

    @RequestMapping("/")
    public String first(){
        return "firstView";
    }

    @RequestMapping("showSecond")
    public String second(HttpServletRequest req, Model model){
        String param = req.getParameter("formValue");
        model.addAttribute("valuerFromRequest", param);
        return "secondView";
    }

}
