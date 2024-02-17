package com.springBootDemo.firstSpring;

import org.springframework.web.bind.annotation.*;

@RestController // annotation to use rest apis
public class HelloController {
    @GetMapping("/hello") // for get requests
    public String hello(){
        return "Hello world!";
    }
    @PostMapping("/hello") // for post requests
    public String helloPost(@RequestBody String name){
        System.out.println("name" + name);
        return "Hello " + name + " world!";
    }
}
