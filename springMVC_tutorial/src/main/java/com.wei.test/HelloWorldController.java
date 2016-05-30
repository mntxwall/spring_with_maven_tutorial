package com.wei.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by cw on 16-5-24.
 */
@Controller
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {

  private UserForm user;
  private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

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
    logger.debug("This is logger");
    return "hi";
  }



  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String showRegisterForm(){
    return "register";
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public String savePost(@Valid UserForm user, Errors errors){

    if(errors.hasErrors()){
      logger.debug("Errors");
      return "register";
    }
    else{
      logger.debug("No error");
    }
    //System.out.println(user);

    return "save";
  }
}
