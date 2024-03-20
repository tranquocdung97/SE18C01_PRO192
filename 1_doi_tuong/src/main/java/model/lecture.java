/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author trieu
 */
public class lecture {
    private String name;
    private day day;
    private String address;
    private String email;
    private String phone;

    public lecture(String name, day day, String address, String email, String phone) {
        this.name = name;
        this.day = day;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public day getDay() {
        return day;
    }

    public void setDay(day day) {
        this.day = day;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "lecture{" + "name=" + name + ", day=" + day + ", address=" + address + ", email=" + email + ", phone=" + phone + '}';
    }

   
    

    
}
