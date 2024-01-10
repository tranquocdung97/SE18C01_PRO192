/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Classes_and_Objects;

/**
 *
 * @author ASUS
 */
public class Student {
	private String name;
	private int age;
	private String gender;
	private double gpa;

	public Student(String name, int age, String gender, double gpa) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.gpa = gpa;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("GPA: " + gpa);
	}
}
