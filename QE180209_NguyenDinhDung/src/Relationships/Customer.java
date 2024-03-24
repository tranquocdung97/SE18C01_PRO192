/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author Administrator
 */
public class Customer {
	private final int id;
	private String name;
	private int discount;

	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
