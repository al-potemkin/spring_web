package com.potemkin.spring.web.controller;

import com.potemkin.spring.web.entity.User;
import com.potemkin.spring.web.repoitory.interfaces.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SpringController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        List<User> userList = userRepo.getUsers();
        model.addAttribute("users", userList);
        return "usersView";
    }


}
