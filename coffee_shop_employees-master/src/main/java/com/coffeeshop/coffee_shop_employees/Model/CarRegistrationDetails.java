package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;

@Component
public class CarRegistrationDetails {
    private long id;
    private String vehiclename;
    private String plateNumber;
    private String engineNumber;
    private String modelNumber;
    private String color;
    private String chasesNumber;
    private String tokenNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getChasesNumber() {
        return chasesNumber;
    }

    public void setChasesNumber(String chasesNumber) {
        this.chasesNumber = chasesNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }
}
