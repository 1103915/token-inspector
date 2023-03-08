package com.coffeeshop.coffee_shop_employees.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;
import com.coffeeshop.coffee_shop_employees.Service.SignInPageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Restcontroller {
    public static  final Logger logger = LoggerFactory.getLogger(Restcontroller.class);
   
    @Autowired
   SignInPageService mService;

    @GetMapping(value="/rest")
    public ResponseEntity<List<EmployeeDetails>> getMethodName() {
        List<EmployeeDetails> mList = mService.GetDetails();
        return new ResponseEntity<List<EmployeeDetails>>(mList,HttpStatus.OK);
    }
    @PostMapping(value ="/mypost")
    public ResponseEntity<EmployeeDetails> create(@RequestBody final EmployeeDetails details){
        mService.AddDetails(details);
        return new ResponseEntity<EmployeeDetails>(details,HttpStatus.CREATED);

    }
    
}
