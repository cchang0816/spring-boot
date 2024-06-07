package com.itbank.day01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.day01.service.AccountService;
import com.itbank.day01.vo.AccountVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {
  
  @Autowired
  private AccountService as;

  @GetMapping("login")
  public void login() {}

  @PostMapping("/login")
  public String login(AccountVO input, HttpSession session) {
    session.setAttribute("user", as.lobin(input));
    return "redirect:/";
  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
    session.removeAttribute("user");
    return "redirect:/";
  }

  @GetMapping("/signUp")
  public void signUp() {}

  @PostMapping("/signUp") 
  public String signUp(AccountVO input) {
    as.signUp(input);

    return "redirect:/account/login";
  }
}
