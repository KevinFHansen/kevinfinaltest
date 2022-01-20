package com.example.kevindemo.htmlControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlControl {

    @GetMapping("/")
    public String index (){
        return "index";
    }
}
