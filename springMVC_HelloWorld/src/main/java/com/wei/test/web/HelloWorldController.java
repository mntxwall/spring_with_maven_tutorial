package com.wei.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.*;

/**
 * Created by cw on 6/5/16.
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @RequestMapping( value = "/file", method = RequestMethod.GET)
    public String file(ModelMap model){
        //FileBucket fileModel = new FileBucket();
        //model.addAttribute("fileBucket", fileModel);
        model.addAttribute("names", "Wei");
        //model.addAttribute("filename", file.getOriginalFilename());

        return "file";
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public String dofile(@RequestParam("fileTest")MultipartFile file, ModelMap model){

        if(!file.isEmpty()){
            String name = file.getOriginalFilename();
            System.out.println(file.getOriginalFilename());
            try {
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(new File("/tmp/web/test/" + name)));
                FileCopyUtils.copy(file.getInputStream(), stream);
                stream.close();

            }
            catch (Exception e) {

            }

            model.addAttribute("name", "Wei");
            model.addAttribute("filename", file.getOriginalFilename());

            //System.out.println(file.getOriginalFilename());
            return "success";
        }

        return "hello";
    }


}
