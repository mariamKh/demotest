package com.mariam.demotest.controllers;

import com.mariam.demotest.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DemoController {

    private UserService userService;

    @Autowired
    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{idStr}/show")
    public String showForm (@PathVariable String idStr, Model model) {

        int id = Integer.parseInt(idStr);
        model.addAttribute("user", userService.findById(id));

        return "show";
    }

}
