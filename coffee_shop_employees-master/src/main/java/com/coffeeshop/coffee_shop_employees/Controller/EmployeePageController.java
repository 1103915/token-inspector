package com.coffeeshop.coffee_shop_employees.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeshop.coffee_shop_employees.Model.CarRegistraionDetails;
import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;
import com.coffeeshop.coffee_shop_employees.Service.CarRegistrationService;
import com.coffeeshop.coffee_shop_employees.Service.EmployeeService;
import com.coffeeshop.coffee_shop_employees.Service.SignInPageService;
import com.coffeeshop.coffee_shop_employees.Model.SignInPage;
@Controller
public class EmployeePageController {
    @Autowired
    EmployeeService firstService;
    @Autowired
    SignInPageService secondservice;
    @Autowired
    CarRegistrationService thirdService;
    @GetMapping("/home")
    public ModelAndView homepage(){
        ModelAndView m1 = new ModelAndView("HomePage");
        m1.addObject(firstService.GetDetails());
        return m1;
    }
    @GetMapping("/Registrationform")
    public String form(Model model){
        model.addAttribute("loginkey",new EmployeeDetails());
        return "reg-form";
    }
    @PostMapping("/pdata")
    public String postdata(@ModelAttribute EmployeeDetails firstdetail){
        firstService.AddDetails(firstdetail);
        return "redirect:/SignInPage";
    }
   @GetMapping("/SignInPage") 
        public String page(Model model){
            model.addAttribute("LoginKey",new SignInPage());
           
            return "LoginPage";    
        } 
    @GetMapping("/Page")
    public String getreq(){
        return "redirect:/home";
    }
    
   
    @PostMapping("/Home")
    public String HomePost(){
        return "redirect:/home";
 
    }
    @GetMapping("/Sign-up")
    public String SignupFromLogin(){
        return "redirect:/Registrationform";
    }
    @GetMapping("/about")
    public String aboutpage(){
        return "AboutPage";
    }
    
    @GetMapping("/token")
    public String token(){
        return "TokenPage";
    }



    @GetMapping("/car")
    public String car(Model model) {
        
        model.addAttribute("info",new CarRegistraionDetails());
        return "CarRegistration";
    }
    @PostMapping("/postcardata")
    public String postdata(@ModelAttribute CarRegistraionDetails detail){
        thirdService.AddDetails(detail);
        return "redirect:/CarInfo";
    }
    @GetMapping("/CarInfo")
    public ModelAndView showCarInfo() {
        ModelAndView m1 = new ModelAndView("CarInformation");
        m1.addObject("cinfo", thirdService.getdetails());
        return m1;
    }
    @GetMapping("/test")
    public String testfile(){
        return "test";
    }
}


