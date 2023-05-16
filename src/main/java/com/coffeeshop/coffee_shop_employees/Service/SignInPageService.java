package com.coffeeshop.coffee_shop_employees.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.UserDetails;
@Service
public class SignInPageService{
   
    List<UserDetails> storage = new ArrayList<>();
    public List<UserDetails> GetDetails(){
        return this.storage;
    }
    public void AddDetails(UserDetails model){
        storage.add(model);
    }
}
