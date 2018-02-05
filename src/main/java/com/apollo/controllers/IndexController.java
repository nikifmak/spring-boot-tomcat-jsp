package com.apollo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String indexPage(Model model) {
        model.addAttribute("message", "Hello world!");
        return "index";
    }
}
