package com.wei.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 16-5-24.
 */
@Controller
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {

  private UserForm user;

  @Autowired
  public HelloWorldController(UserForm user) {
    this.user = user;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String hello(ModelMap model){
    model.addAttribute("name", "Spring MVC!");
    return "helloWorld";
  }

  @RequestMapping(value = "/{param}", method = RequestMethod.GET)
  public String getParam(@PathVariable String param, ModelMap model){
    model.addAttribute("name", param);
    return "hi";
  }

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String showRegisterForm(){
    return "register";
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public void savePost(UserForm user){
    System.out.println(user);

  }
}
