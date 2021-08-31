package com.potemkin.spring.web.controller;

import com.potemkin.spring.web.entity.Product;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String second(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "firstView";
        else
            return "secondView";
    }

}
