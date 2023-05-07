package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.CarRegistraionDetails;

@Service
public class CarRegistrationService {
    List<CarRegistraionDetails> details = new ArrayList<>();

   public void AddDetails(CarRegistraionDetails cardetails){
        details.add(cardetails);
    }
    public List<CarRegistraionDetails> getdetails(){
        return details;
    }
}
