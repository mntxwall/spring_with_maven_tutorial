package com.wei.project.controller;

import com.wei.project.dao.UserDAO;
import com.wei.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cw on 6/13/16.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserDAO userDao;

    @RequestMapping(method = RequestMethod.GET)
    public String login(@ModelAttribute("userinfo") User user){

        return "login";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String logincheck(@Valid @ModelAttribute("userinfo") User user, Errors bindingResult){

        if (bindingResult.hasErrors()){

            List<FieldError> p = bindingResult.getFieldErrors();

            p.forEach((temp) ->{System.out.println(String.format("%s %s", temp.getField(), temp.getDefaultMessage()));});

            //System.out.println(bindingResult.getFieldErrors("password"));
            return "error";
        }

        User tmp = userDao.getLoginUser(user.getName());
        if(!(tmp.getPassword().equals(user.getPassword()))){
            return "error";
        }

        return "success";
    }


}
