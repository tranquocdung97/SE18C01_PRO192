/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesandObjects;

/**
 *
 * @author ASUS
 */
public class bai4 
{

    public static class Student 
    {
        private String name;
        private int age;

        public Student(String name, int age) 
        {
            this.name = name;
            this.age = age;
        }
        public void display() 
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
        public static void main(String[] args) 
        {
            Student s1 = new Student("Long", 24);
            Student s2 = new Student("Kien", 29);
            s1.display();
            s2.display();
        }
   }
