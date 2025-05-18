package com.scm.scmv1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.scmv1.entities.Providers;
import com.scm.scmv1.entities.User;
import com.scm.scmv1.forms.UserForm;
import com.scm.scmv1.helpers.Message;
import com.scm.scmv1.helpers.MessageType;
import com.scm.scmv1.services.UserService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

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
    public String registerPage(Model model){
        UserForm userForm=new UserForm();
        model.addAttribute("userForm", userForm);
        return "register";
    }

    //Processing registartion
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm,HttpSession session) {
        // Fetching form data
        // Validating form data
        // Saving data to database
        // User user=User.builder()
        //             .name(userForm.getName())
        //             .email(userForm.getEmail())
        //             .password(userForm.getPassword())
        //             .about(userForm.getAbout())
        //             .phoneNumber(userForm.getPhoneNumber())
        //             .profilePic("https://avatars.githubusercontent.com/u/157240150?v=4")
        //             .build();

        User user=new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setAbout(userForm.getAbout());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setProfilePic("https://avatars.githubusercontent.com/u/157240150?v=4");
        user.setProvider(Providers.SELF);

        User savedUser=userService.saveUser(user);
        Message message=Message.builder().content("Registration Successfull").type(MessageType.green).build();
        session.setAttribute("message", message);
        System.out.println(savedUser);
        return "redirect:/register";
    }
}
