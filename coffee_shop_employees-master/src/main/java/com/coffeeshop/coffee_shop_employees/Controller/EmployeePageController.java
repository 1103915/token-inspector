package com.coffeeshop.coffee_shop_employees.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;
import com.coffeeshop.coffee_shop_employees.Model.HomePage;
import com.coffeeshop.coffee_shop_employees.Service.EmployeeService;
import com.coffeeshop.coffee_shop_employees.Service.SignInPageService;
import com.coffeeshop.coffee_shop_employees.Model.SignInPage;
@Controller
public class EmployeePageController {
    @Autowired
    EmployeeService firstService;
    @Autowired
    SignInPageService secondservice;
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
            model.addAttribute("SignKey",new SignInPage());
           
            return "LoginPage";    
        } 
    @GetMapping("/Page")
    public String getreq(){
        return "redirect:/home";
    }
    @GetMapping("/about")
    public String aboutpage(){
        return "chatGptAboutPage";
    }
    @GetMapping("/test")
    public String testpage(Model model){
        model.addAttribute("LoginKey", new SignInPage()); 
        return "LoginTest";
    }
    @PostMapping("/Home")
    public String HomePost(){
        return "redirect:/home";
    }
    @GetMapping("/personalInfo")
    public String pinfo(){
        return "Personal_Info";
    }
}
