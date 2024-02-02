/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

/**
 *
 * @author ASUS
 */

  public class Student extends Person {
	private double gpa;

	public Student(String name, int age, String address, double gpa) {
		super(name, age, address);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("GPA: " + gpa);
	}
}

