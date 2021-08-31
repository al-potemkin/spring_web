package com.potemkin.spring.web.controller;

import com.potemkin.spring.web.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

    @RequestMapping("/")
    public String first(Model model) {
        model.addAttribute("product", new Product());
        return "firstView";
    }

    @RequestMapping("showSecond")
    public String second(@ModelAttribute("product") Product product) {
        return "secondView";
    }

}
