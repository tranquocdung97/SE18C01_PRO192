/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

import Person.Customer;

/**
 *
 * @author admin
 */
class Person {
     public abstract class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public abstract void display();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
class test1 {
    public static void main(String[] args) {
		Employee person1 = new Employee("Trung", "HN", 3300);
		Customer person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}
}
