package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Table;



@Component
@Table(name="EmployeeTable")
public class EmployeeDetails {
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String dob;
    @Column
    private String shift;
    @Column
    protected String email;
    @Column
    protected String password;
    @Column
    private long contactnumber;
    @Column
    private String gender;
    @Column
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
