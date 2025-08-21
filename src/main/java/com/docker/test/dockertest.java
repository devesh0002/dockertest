package com.docker.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class dockertest {
    @GetMapping("/message")
    public String testingcode(){
        return"Hello from ci/cd";
    }
}
