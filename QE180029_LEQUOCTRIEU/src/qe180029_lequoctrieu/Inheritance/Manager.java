/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu;

/**
 *
 * @author trieu
 */

    public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
            super(name, salary);
            this.bonus = bonus;
    }

    public int getSalary() {
            return super.getSalary() + bonus;
    }

    public int getBonus() {
            return bonus;
    }

    public void setBonus(int bonus) {
            this.bonus = bonus;
    }

    public void display() {
            System.out.println("Name: " + getName());
            System.out.println("Salary: " + getSalary());
    }
}
