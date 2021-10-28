package com.mariam.demotest.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoErrorController implements ErrorController {

    @GetMapping("error")
    public String resourceNotFound () {
        return "404error";
    }
}
