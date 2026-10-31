package com.yusuf.lecture_02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
class HomeController {

    @GetMapping("hello")
    public String greetings() {
        return "<h1>HEllo From Spring boot</h1>";
    }

}