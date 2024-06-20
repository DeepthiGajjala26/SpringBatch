package com.springbatch.BaiscSpringBatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/get")
    public String test(){
        return "started controller";
    }
    @GetMapping("/test")
    public String deepu(){
        return "end controller";
    }
    @GetMapping("/merge")
    public String merge(){
        return "merge sucessfully";
    }
    @GetMapping("/test1")
    public String test1(){
        return "test1 sucessfully";
    }

}
