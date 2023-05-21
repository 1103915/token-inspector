package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.TokenInspector.Token_Inspector.Model.form.LoginForm;
import com.TokenInspector.Token_Inspector.Model.form.RegisterForm;
import com.TokenInspector.Token_Inspector.Repository.UserRepository;


@Controller
public class AuthController {
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;
    AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    // login page (/login, /signin)
    @GetMapping("/login")
    String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    // registration page (/register, signup)
    @GetMapping("/register")
    String register(Model model) {
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping("/register")
    String processRegister(@ModelAttribute RegisterForm registerForm) {
        // validation
        userRepository.save(registerForm.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
