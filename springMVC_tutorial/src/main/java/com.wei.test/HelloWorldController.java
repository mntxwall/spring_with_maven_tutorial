package com.wei.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 16-5-24.
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
  @RequestMapping(method = RequestMethod.GET)
  public String hello(ModelMap model){
    model.addAttribute("name", "Spring MVC!");
    return "helloWorld";
  }
}
