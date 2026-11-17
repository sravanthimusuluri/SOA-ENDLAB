package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class AdditionController {

    @GetMapping(value = "/add", produces = "text/plain;charset=UTF-8")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS Addition = " + (a + b);
    }
}
