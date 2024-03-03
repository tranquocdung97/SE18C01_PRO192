/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphismandabstraction;

/**
 *
 * @author ASUS
 */
public class PartTimeEmployee extends EEmployee {
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