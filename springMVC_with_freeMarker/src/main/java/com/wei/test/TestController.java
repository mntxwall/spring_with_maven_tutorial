package com.wei.test;

import com.wei.test.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cw on 5/31/16.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(){

        return "test";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doTest(@Validated User user){


        return "test";
    }
}
