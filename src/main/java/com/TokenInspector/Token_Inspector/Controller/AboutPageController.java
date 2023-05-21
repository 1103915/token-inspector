package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPageController {
    @GetMapping("/about")
    public String aboutpage() {
        return "AboutPage";
    }
}
