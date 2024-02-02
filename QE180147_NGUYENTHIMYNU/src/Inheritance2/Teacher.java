/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person {
	private int salary;

	public Teacher(String name, int age, String address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + salary);
	}
}
