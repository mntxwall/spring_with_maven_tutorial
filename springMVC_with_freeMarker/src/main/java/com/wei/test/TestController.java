package com.wei.test;

import com.wei.test.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 * Created by cw on 5/31/16.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(@ModelAttribute("userinfo") User user){

        return "test";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doTest(
            @Valid @ModelAttribute("userinfo") User user,
            Errors bindingResult){

        /*if(bindingResult.hasErrors()){

            return "hello";
        }*/

        //bindingResult.rejectValue("name", "nono");

        return "test";
    }

    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String file(){

        return "file";
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public String doFile(@RequestParam("file") MultipartFile file){

        if (file.isEmpty()){
            return "error";
        }

        return "hello";
    }
}
