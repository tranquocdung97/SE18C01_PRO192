/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author doanh
 */
class Student {
	private String name;
	private String address;
	private double gpa;

	public Student(String name, String address, double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}
	public String toString() {
		return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
	}
}
public class BT5 {
    public static void main(String[] args) {
        
    }
}
