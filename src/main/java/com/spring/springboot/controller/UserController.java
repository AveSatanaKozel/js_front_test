package com.spring.springboot.controller;

import com.spring.springboot.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("")
    public User getUs(Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("User has authorities: " + userDetails.getAuthorities());
        System.out.println(authentication.getName() + " First");
        System.out.println(authentication.getPrincipal() + " Second");
        User user = (User) authentication.getPrincipal();
        System.out.println(authentication.getName() + " fired");
        System.out.println(authentication.getPrincipal() + " fourth");
        return user;
    }
}

