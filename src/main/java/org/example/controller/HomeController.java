package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {



    @GetMapping
    public String getHome(){
        return "Hello Welcome Home!";
    }

    @GetMapping("/{name}")
    public String greetingToUser(@PathVariable String name){
        return "Hello " + name + "!";
    }
}
