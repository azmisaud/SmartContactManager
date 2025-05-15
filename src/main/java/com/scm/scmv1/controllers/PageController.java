package com.scm.scmv1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name", "Saud");
        model.addAttribute("department","computer science");
        
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    // services route
    @RequestMapping("/services")
    public String servicesPage(){
        return "services";
    }

    // contact page
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }
}
