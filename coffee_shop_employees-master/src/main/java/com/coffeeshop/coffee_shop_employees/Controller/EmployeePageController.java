package com.coffeeshop.coffee_shop_employees.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;
import com.coffeeshop.coffee_shop_employees.Service.EmployeeService;
import com.coffeeshop.coffee_shop_employees.Service.SignInPageService;

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
        return "redirect:/home";
    }
    @GetMapping("/SignInPage")
        public ModelAndView login(){
            ModelAndView view2 = new ModelAndView("LoginPage");
            view2.addObject("SignInKey",secondservice.GetLoginDetails());
            return view2;
        }
}
