package com.wei.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 5/30/16.
 */
@Controller
@RequestMapping(value = "/hello")
public class HomeController {

  @RequestMapping(method = RequestMethod.GET)
  public String hello(){
    return "hello";
  }
}
