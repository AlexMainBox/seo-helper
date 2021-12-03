package com.zharkov.seohelper.restController;

import com.zharkov.seohelper.model.UserForm;
import com.zharkov.seohelper.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/registration")
public class RegistrationController {



    private RegistrationService registrationService;

    @Autowired
    public RegistrationController( RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ModelAndView registrationPage(Model model){
        model.addAttribute("userForm", new UserForm());
        return new ModelAndView("registration");
    }

    @PostMapping
    public String newRegistration(UserForm userForm){
        if (registrationService.registration(userForm)){
            return "Registration complete";
        }else
            return "This email already used!";

    }


}

