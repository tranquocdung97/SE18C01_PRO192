/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu;

/**
 *
 * @author trieu
 */

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
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

    public void display() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
    }
}



