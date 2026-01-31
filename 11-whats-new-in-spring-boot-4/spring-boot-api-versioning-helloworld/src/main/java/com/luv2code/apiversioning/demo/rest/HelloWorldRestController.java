package com.luv2code.apiversioning.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping(path="/api/hello")
    public String helloV1() {
        return "Hello World";
    }

}
