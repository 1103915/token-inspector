package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.CarRegistrationDetails;

@Service
public class CarRegistrationService {
    List<CarRegistrationDetails> details = new ArrayList<>();

   public void AddDetails(CarRegistrationDetails cardetails){
        details.add(cardetails);
    }
    public List<CarRegistrationDetails> getdetails(){
        return details;
    }
}
