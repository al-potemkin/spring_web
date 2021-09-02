package com.potemkin.spring.web.controller;

import com.potemkin.spring.web.entity.User;
import com.potemkin.spring.web.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SpringController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        List<User> userList = userService.getUsers();
        model.addAttribute("users", userList);
        return "usersView";
    }

    @RequestMapping("/add")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userAddView";
    }

    @RequestMapping("/saveNewUser")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam(name = "userId") int userId, Model model) {
        User user = userService.getUser(userId);
        model.addAttribute("user", user);
        return "userAddView";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam(name = "userId") int userId) {
        userService.deleteUser(userId);
        return "redirect:/";
    }


}
