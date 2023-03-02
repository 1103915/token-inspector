package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.SignInPage;

@Service
public class SignInPageService {
  List<SignInPage> login = new ArrayList<>();

  public List<SignInPage> GetLoginDetails(){
    return this.login;
  }
  public void AddLoginDetails(SignInPage p1){
    login.add(p1);
  }
}
