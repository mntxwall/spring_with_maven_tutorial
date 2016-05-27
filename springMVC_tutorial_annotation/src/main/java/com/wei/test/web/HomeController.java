package com.wei.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 5/27/16.
 */
@Controller
@RequestMapping("/")
public class HomeController {
  @RequestMapping(method = RequestMethod.GET)
  public String home(){
    return "home";
  }
}
