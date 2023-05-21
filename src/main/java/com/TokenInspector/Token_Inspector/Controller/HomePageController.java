package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.TokenInspector.Token_Inspector.Service.SignInPageService;

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
