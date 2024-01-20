/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesandObjects;
public class bai5 {
    public static class Student
{
    private String name;
    private int age;
    private String gender;
    private double gpa;

    public Student (String name, int age,String gender , double gpa)
    {
        this.name = name;
        this.age =age;
        this.gender = gender;
        this.gpa = gpa;
    }
    public void display ()
    {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("gender: "+gender);
         System.out.println("gpa : "+ gpa);
    }
          public static void main(String[] args) 
        {
            Student s1 = new Student("Long", 24," gioi",4.0);
            s1.display();
            
        }
    }
}
