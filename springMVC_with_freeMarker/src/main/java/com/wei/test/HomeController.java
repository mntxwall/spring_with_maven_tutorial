package com.wei.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cw on 5/30/16.
 */
@Controller
@RequestMapping(value = "/hello")
public class HomeController {

  @RequestMapping(method = RequestMethod.GET)
  public String hello(Model model){

    List<String> s = new ArrayList<String>();

    s.add("apple");s.add("pair");
    model.addAttribute("fruits", s);
    model.addAttribute("name", "Hello");
    //model.addAllAttributes(s);
    //model.addAttribute()
    //model.a
    return "hello";
  }
}
