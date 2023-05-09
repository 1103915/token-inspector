package com.coffeeshop.coffee_shop_employees.Model;

import java.util.Optional;
import java.util.Random;


import org.springframework.stereotype.Component;

@Component
public class CarRegistrationDetails {

        private String plateNumber;
        private String engineNumber;
        private String modelNumber;
        private String color;
        private String ChasesNumber;
        Random random = new Random();
        int max = 1000;
        int min = 1;
        private int TokenNumber = random.nextInt((max-min)+1);
        private String myrandomstring=null;
        
        

        public String getMyrandomstring() {
            return myrandomstring;
        }

        public void setMyrandomstring(String Myrandomstring) {
            Myrandomstring = Integer.toString(TokenNumber);
            this.myrandomstring = Myrandomstring;
        }

        public int getTokenNumber() {
            return TokenNumber;
        }

        public void setTokenNumber(int tokenNumber) {
            TokenNumber = tokenNumber;
        }

        public String getChasesNumber() {
            return ChasesNumber;
        }

        public void setChasesNumber(String chasesNumber) {
            ChasesNumber = chasesNumber;
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
    
      
    }
       

