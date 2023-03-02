package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmployeeDetails {
    private String name;
    private int age;
    private String dob;
    private String shift;
    private String email;
    private String password;
    private long contactnumber;
    private String gender;
    private String me;
    
}
