package com.zharkov.seohelper.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/auth/login")
public class LoginController {

    @GetMapping
    public ModelAndView loginPage(){
        return new ModelAndView("login");
    }

}
