/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class bai_tap_ke_thua_2_1 {
//    
//}
//public class Manager extends Employee {
	private int bonus;

	public bai_tap_ke_thua_2_1(String name, int salary, int bonus) {
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

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}