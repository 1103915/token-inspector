package com.TokenInspector.Token_Inspector.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TokenInspector.Token_Inspector.Model.CarRegistrationDetails;

@Repository
public interface CarRepository extends JpaRepository<CarRegistrationDetails, Long> {
    List<CarRegistrationDetails> findCarRegistrationDetailsByPlateNumber(String plateNumber);
}
