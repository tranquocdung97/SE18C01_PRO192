/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author ADMIN
 */
public class Exercise5 {
    private String name, gender;
    private int age;
    private double gpa;
    public Exercise5(String name, int age, String gender, double gpa)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }
}
