package com.flash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @PostMapping("/sanitise")
    public String sanitise(String sentence){
        return sentence;

    }

}
