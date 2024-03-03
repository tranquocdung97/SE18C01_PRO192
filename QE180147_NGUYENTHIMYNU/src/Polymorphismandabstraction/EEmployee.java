/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphismandabstraction;

/**
 *
 * @author ASUS
 */
public abstract class EEmployee implements IEmployee {
	private String name;
	private int paymentPerHour;

	public EEmployee(String name, int paymentPerHour) {
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
