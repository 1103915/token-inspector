package com.coffeeshop.coffee_shop_employees.Model;

public class CarRegistraionDetails {
    public class CarInfo {
        private String plateNumber;
        private String engineNumber;
        private String modelNumber;
        private String color;
    
        public CarInfo(String plateNumber, String engineNumber, String modelNumber, String color) {
            this.plateNumber = plateNumber;
            this.engineNumber = engineNumber;
            this.modelNumber = modelNumber;
            this.color = color;
        }
    
        public String getPlateNumber() {
            return plateNumber;
        }
    
        public String getEngineNumber() {
            return engineNumber;
        }
    
        public String getModelNumber() {
            return modelNumber;
        }
    
        public String getColor() {
            return color;
        }
    }
       
}
