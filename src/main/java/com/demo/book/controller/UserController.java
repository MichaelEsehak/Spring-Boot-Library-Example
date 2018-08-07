/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.book.controller;

import com.demo.book.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Michael
 */
@Controller
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/{username}")
    public String sayHello(@PathVariable String username, Model model) {

        model.addAttribute("name", userRepo.findByUsername(username));
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHi() {
        return "index";
    }

}
