package com.coffeeshop.coffee_shop_employees.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.SignInPage;
import com.coffeeshop.coffee_shop_employees.Model.UserDetails;
@Repository
public interface SignInPageService extends JpaRepository<SignInPage,Long>{
   
   
}
