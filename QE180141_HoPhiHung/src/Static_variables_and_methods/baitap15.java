/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_variables_and_methods;

/**
 *
 * @author Ho Phi Hung
 */
public class baitap15 {
    //public class Student {
	 String name;
	 char gender;

	public baitap15() {
		name = "Unknown";
		gender = 'u';
	}

	public baitap15(String name) {
		this.name = name;
		this.gender = 'u';
	}

	public baitap15(char gender) {
		this.name = "Unknown";
		this.gender = gender;
	}

	public baitap15(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void display() {
		System.out.println("Name: " + name);
		if (gender == 'u') {
			System.out.println("Gender: Unknown");
		}
		if (gender == 'm') {
			System.out.println("Gender: Male");
		}
		if (gender == 'f') {
			System.out.println("Gender: Female");
		}
	}
}