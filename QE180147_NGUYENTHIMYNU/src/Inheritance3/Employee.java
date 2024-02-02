/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance3;

/**
 *
 * @author ASUS
 */
    public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
 public static void main(String[] args) {
		Employee s = new Employee("Khanh", 1500);
		s.display();
		System.out.println();
		Manager t = new Manager("Binh", 2500,1600);
		t.display();
	}
    }
