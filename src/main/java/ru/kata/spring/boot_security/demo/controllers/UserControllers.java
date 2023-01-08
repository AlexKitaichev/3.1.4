package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.kata.spring.boot_security.demo.models.Person;



@Controller

public class UserControllers {

    @GetMapping("/user")
    public String person(Model model, @AuthenticationPrincipal Person person) {
        model.addAttribute("person", person);
        return "person/person";
    }

}
