/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class bai_tap_ke_thua_2 {
  
	private String name;
	private int salary;

	public bai_tap_ke_thua_2(String name, int salary) {
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
