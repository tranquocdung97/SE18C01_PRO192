/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet.baithu;

/**
 *
 * @author FPTSHOP
 */
public interface bai31 {
	int calculateSalary();
	String getName();
}
 abstract class Employee implements bai31 {
	private String name;
	private int paymentPerHour;

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}


        @Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
}
 class PartTimeEmployee extends Employee {
	private int workingHours;

	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}


        @Override
	public int calculateSalary() {
		return workingHours * getPaymentPerHour();
	}
}
 class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	
        @Override
	public int calculateSalary() {
		return 8 * getPaymentPerHour();
	}
}

