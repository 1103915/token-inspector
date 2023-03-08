package com.coffeeshop.coffee_shop_employees.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;
@Service
public class SignInPageService{
   
    List<EmployeeDetails> storage = new ArrayList<>();
    public List<EmployeeDetails> GetDetails(){
        return this.storage;
    }
    public void AddDetails(EmployeeDetails model){
        storage.add(model);
    }
}
