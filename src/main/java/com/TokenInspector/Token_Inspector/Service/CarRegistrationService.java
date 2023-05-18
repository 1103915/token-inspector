package com.TokenInspector.Token_Inspector.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.TokenInspector.Token_Inspector.Model.CarRegistrationDetails;

@Repository
public interface CarRegistrationService extends JpaRepository<CarRegistrationDetails,Long>{
    //List<CarRegistrationDetails> details = new ArrayList<>();
/*
    public void AddDetails(CarRegistrationDetails cardetails) {
        cardetails.setId(details.size()+1);
        
    }




    public default void generateTokenNumber(long cardId) {
        int min = 1000;
        int max = 2000;
        String tokenNumber = String.format("%04d", (int)Math.floor(Math.random() *(max - min + 1) + min));
        details.stream().filter(car -> car.getId() == cardId).findFirst().get().setTokenNumber(tokenNumber);
    } */
}
