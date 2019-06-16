package com.tao.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevtoolsController {

    @RequestMapping("/dev")
    public String devtoolsDemo(){
        return "devtools";
    }
}
