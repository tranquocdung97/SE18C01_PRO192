/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public abstract class Employee2 implements IEmployee 
{
	private String name;
	private int paymentPerHour;

	public Employee2(String name, int paymentPerHour) 
        {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public String getName() 
        {
		return name;
	}

	public void setName(String name) 
        {
		this.name = name;
	}

	public int getPaymentPerHour() 
        {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) 
        {
		this.paymentPerHour = paymentPerHour;
	}
}
