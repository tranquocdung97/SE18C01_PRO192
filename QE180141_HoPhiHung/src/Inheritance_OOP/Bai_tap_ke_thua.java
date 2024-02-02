/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class Bai_tap_ke_thua {
    
	private String name;
	private int age;
	private String address;

	public Bai_tap_ke_thua(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
}