package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;



@Component

public class EmployeeDetails {
    private String name;
    private int age;
    private String dob;
    private String shift;
    protected String email;
    protected String password;
    private long contactnumber;
    private String gender;
    private String me;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getContactnumber() {
        return contactnumber;
    }
    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMe() {
        return me;
    }
    public void setMe(String me) {
        this.me = me;
    }
    
}
