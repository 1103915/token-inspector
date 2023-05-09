package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeeshop.coffee_shop_employees.Model.CarRegistrationDetails;

@Service
public class CarRegistrationService {
    List<CarRegistrationDetails> details = new ArrayList<>();

    public void AddDetails(CarRegistrationDetails cardetails) {
        cardetails.setId(details.size()+1);
        details.add(cardetails);
    }

    public List<CarRegistrationDetails> getdetails() {
        return details;
    }

    public void generateTokenNumber(long cardId) {
        int min = 1000;
        int max = 2000;
        String tokenNumber = String.format("%04d", (int)Math.floor(Math.random() *(max - min + 1) + min));
        details.stream().filter(car -> car.getId() == cardId).findFirst().get().setTokenNumber(tokenNumber);
    }
}
