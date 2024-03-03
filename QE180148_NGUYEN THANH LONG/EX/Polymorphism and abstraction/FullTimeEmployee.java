/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class FullTimeEmployee extends Employee2 
{
	public FullTimeEmployee(String name, int paymentPerHour) 
        {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() 
        {
		return 8 * getPaymentPerHour();
	}
}
