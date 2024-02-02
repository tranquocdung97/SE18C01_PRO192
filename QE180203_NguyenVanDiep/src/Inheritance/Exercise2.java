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
class Person {
    private String name;
    private String gender;
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}
class Student extends Person {
    private int salary;
    public Student(String name, String gender, int salary)
    {
        super(name, gender);
        this.salary = salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public void display()
    {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        Student s = new Student("Trung", "Male", 1700);
        s.display();
    }
}
