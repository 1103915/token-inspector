package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.TokenInspector.Token_Inspector.Model.CarRegistrationDetails;
import com.TokenInspector.Token_Inspector.Service.CarRegistrationService;
import com.TokenInspector.Token_Inspector.Service.UserService;
import com.TokenInspector.Token_Inspector.Service.SignInPageService;
import com.TokenInspector.Token_Inspector.Model.UserInfo;

@Controller
public class EmployeePageController {

private UserService firstService;
    @Autowired
    SignInPageService secondservice;

private CarRegistrationService thirdService;

    @GetMapping("/home")
    public ModelAndView homepage() {
        ModelAndView m1 = new ModelAndView("HomePage");
        m1.addObject(firstService.findAll());
        return m1;
    }

    @GetMapping("/Registrationform")
    public String form(Model model) {
        model.addAttribute("loginkey", new UserInfo());
        return "reg-form";
    }

    @PostMapping("/pdata")
    public String postdata(@ModelAttribute UserInfo firstdetail) {
        firstService.save(firstdetail);
        return "redirect:/SignInPage";
    }

    @GetMapping("/SignInPage")
    public String page(Model model) {
        model.addAttribute("LoginKey", new UserInfo());
        
        return "LoginPage";
    }

    @GetMapping("/homepage")
    public String getreq() {
        return "redirect:/home";
    }

    @PostMapping("/Home")
    public String HomePost() {
        return "redirect:/home";

    }

    @GetMapping("/Sign-up")
    public String SignupFromLogin() {
        return "redirect:/Registrationform";
    }

    @GetMapping("/about")
    public String aboutpage() {
        return "AboutPage";
    }

    @GetMapping("/token")
    public String token() {
        return "TokenPage";
    }

    @GetMapping("/car")
    public String car(Model model) {

        model.addAttribute("info", new CarRegistrationDetails());
        return "CarRegistration";
    }

    @PostMapping("/postcardata")
    public String postdata(@ModelAttribute CarRegistrationDetails detail){
        thirdService.save(detail);
        return "redirect:/CarInfo";
    }

    @GetMapping("/CarInfo")
    
    public ModelAndView showCarInfo() {
        ModelAndView m1 = new ModelAndView("CarInformation");
        m1.addObject("cinfo", thirdService.findAll());
        return m1;
        
    }

    @GetMapping("/generateTokenNumber/{carId}")
    public String generateTokenNumber(@PathVariable long carId) {
        int min=1000;
        int max=2000;
        String tokenNumber = String.format("%04d", (int)Math.floor(Math.random()*(max-min+1)+min));
        CarRegistrationDetails car = this.thirdService.findById(carId).get();
        car.setTokenNumber(tokenNumber);
        this.thirdService.save(car);
        /*thirdService.generateTokenNumber(cardId);*/
        return "redirect:/CarInfo";
    }

    @GetMapping("/test")
    public String testfile() {
        return "test";
    }
}
