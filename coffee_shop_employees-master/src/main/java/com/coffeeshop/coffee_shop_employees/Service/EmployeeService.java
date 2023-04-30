package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;


@Service
public class EmployeeService {
    @Autowired
    EmployeeServiceH2 storage;
    public EmployeeDetails CreateNewUser(EmployeeDetails details){
        return storage.save(details);
    }
    
    
}
