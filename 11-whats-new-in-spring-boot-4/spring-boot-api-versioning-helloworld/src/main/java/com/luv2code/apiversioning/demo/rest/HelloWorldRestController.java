package com.luv2code.apiversioning.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping(path="/api/{version}/hello", version="1")
    public String helloV1() {
        return "Hello World from API v1";
    }

    @GetMapping(path="/api/{version}/hello", version="2")
    public String helloV2() {
        return "Howdy World from API v2";
    }

    @GetMapping(path="/api/{version}/hello", version="3")
    public String helloV3() {
        return "Hey Hey World from API v3";
    }
}
