package com.learn.springframework.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {

    @ResponseBody
    @RequestMapping("/")
    public  String message(){
        return "Hello world";
    }
}
