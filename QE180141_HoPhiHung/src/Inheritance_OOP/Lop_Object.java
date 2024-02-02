/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class Lop_Object {
	private String name;
	private String address;
	private double gpa;

	public Lop_Object(String name, String address, double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
	}
}