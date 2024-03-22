/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ADMIN
 */
public class Exercise5 {
    private String name;
    private String address;
    private double gpa;
    public Student(String name, String address, double gpa)
    {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    public String toString() {
        return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
    }
}
