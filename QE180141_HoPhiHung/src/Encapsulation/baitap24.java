/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Ho Phi Hung
 */
public class baitap24 {
    
//public class Account {
	int id;
	 String name;
	 int balance = 0;

	public baitap24(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public baitap24(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;		
		}else {
			System.out.println("That amount exceeds your current balance.");
		}
	}
	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}