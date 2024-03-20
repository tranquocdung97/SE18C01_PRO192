/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphismandabstraction;

/**
 *
 * @author ASUS
 */
public class BAI3 {
    public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary per day: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salary per day: " + employee2.calculateSalary());
	}
}
