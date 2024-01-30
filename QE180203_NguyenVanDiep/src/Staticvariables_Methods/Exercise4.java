/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staticvariables_Methods;

/**
 *
 * @author ADMIN
 */
public class Exercise4 {
    private String name;
    private char gender;
    public Student()
    {
        name = "Unknown";
        gender = 'u';
    }
    public Student(String name)
    {
        this.name = name;
        this.gender = 'u';
    }
    public Student(char gender)
    {
        this.name = "Unknown";
        this.gender = gender;
    }
    public Student(String name, char gender)
    {
        this.name = name;
        this.gender = gender;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        if(gender == 'u') System.out.println("Gender: Unknown");
        if(gender == 'm') System.out.println("Gender: Male");
        if(gender == 'f') System.out.println("Gender: Female");
    }
}
