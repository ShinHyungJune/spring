package com.example.spring.controller;

import com.example.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/users")
    public String create()
    {
        return "/users/create";
    }

    @PostMapping("/users")
    public String store(@Valid User user, BindingResult result)
    {
        System.out.println(result);

        return "/users/create";
    }
}
