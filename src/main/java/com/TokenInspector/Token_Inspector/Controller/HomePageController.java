package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {

    @GetMapping("/")
    String home() {
        return "HomePage";
    }

  

   

   /* @GetMapping("/test")
    public String testfile() {
        return "test";
    } */
}
