/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismandAbstraction and abstraction;

import c.Person;

/**
 *
 * @author admin
 */
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
		c.Employee person1 = new c.Employee("Trung", "HN", 3300);
		c.Customer person2 = new c.Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}
public class Customer extends Person {
	private int balance;

	public Customer(String name, String address, int balance) {
		super(name, address);
		this.balance = balance;
	}

	@Override
	public void display() {
		System.out.println("Customer name: " + super.getName());
		System.out.println("Customer address: " + super.getAddress());
		System.out.println("Customer balance: " + balance);
	}
}
public class Employee extends Person {
	private int salary;
	
	public Employee(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	@Override
	public void display() {
		System.out.println("Employee name: " + super.getName());
		System.out.println("Employee address: " + super.getAddress());
		System.out.println("Employee salary: " + salary);
	}	
}
    