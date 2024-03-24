/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import javax.lang.model.SourceVersion;

/**
 *
 * @author ADMIN
 */
class Person{
    private String name;
    private int dob;
    public Person(String name, int dob)
    {
        this.name = name;
        this.dob = dob;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getDob()
    {
        return dob;
    }
    public void setDob(int dob)
    {
        this.dob = dob;
    }
}
class Student extends Person {
    private double gpa;
    public Student(String name, int dob, double gpa)
    {
        super(name,dob);
        this.gpa = gpa;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    }
public class Exercise1 {
    public static void main(String[] args) {
        Student s = new Student("Hai", 1999, 8.8);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGpa());
    }
}
