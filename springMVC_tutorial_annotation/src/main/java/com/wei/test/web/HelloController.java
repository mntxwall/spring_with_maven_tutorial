package com.wei.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 5/27/16.
 */
@Controller
@RequestMapping(value = "/home")
public class HelloController {
  @RequestMapping(method = RequestMethod.GET)
  public String hello(ModelMap modelMap){

    modelMap.addAttribute("names", "Wei");

    return "hello";
  }
}
