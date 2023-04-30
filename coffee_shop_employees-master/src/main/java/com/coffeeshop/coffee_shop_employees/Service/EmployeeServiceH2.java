package com.coffeeshop.coffee_shop_employees.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeeshop.coffee_shop_employees.Model.EmployeeDetails;

public interface EmployeeServiceH2 extends JpaRepository<EmployeeDetails,Long>{
    
}
