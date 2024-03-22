/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */public class Student {
	private String name;
	private String address;
	private double gpa;

	public Student(String name, String address, double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}

	
public class bt106 {
    @Override
	public String toString() {
		return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
	}
}
}
