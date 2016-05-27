package com.wei.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 16-5-24.
 */
@Controller
public class HelloWorldController {
  @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
  public String hello(ModelMap model){
    model.addAttribute("name", "Spring MVC!");
    return "helloWorld";
  }

  @RequestMapping(value = "/helloWorld/{param}", method = RequestMethod.GET)
  public String getParam(@PathVariable("param") String param, ModelMap model){
    model.addAttribute("param", param);
    return "hi";
  }
}
