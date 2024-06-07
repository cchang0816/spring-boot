package com.itbank.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.test.vo.PersonVO;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("per", new PersonVO("hong", 20, 178.8));
        return "home";
    }
        
}
