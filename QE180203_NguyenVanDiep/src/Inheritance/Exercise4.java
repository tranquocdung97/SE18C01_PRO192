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
public class Exercise4 {
    private String name;
    private int salary;
    public Employee(String name, int salary)
    {
        super();
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
