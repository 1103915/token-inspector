package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;

@Component
public class CarRegistraionDetails {

        private String plateNumber;
        private String engineNumber;
        private String modelNumber;
        private String color;
        private String ChasesNumber;
    
        

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
       

