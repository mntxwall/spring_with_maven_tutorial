package com.wei.project.controller;

import com.wei.project.dao.UserDAO;
import com.wei.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by cw on 6/15/16.
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private UserDAO userDao;

    @RequestMapping(method = RequestMethod.GET)
    public String register(@ModelAttribute("userinfo") User user){

        return "register";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkRegister(@Valid @ModelAttribute("userinfo") User user,
                                @RequestParam("repassword") String rep,
                                Errors bindResult){


        if(bindResult.hasErrors() || !user.getPassword().equals(rep)){
            return "error";
        }

        userDao.save(user);

        //System.out.println(rep);

        return "redirect:/login";
    }
}
