/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.encapsulation.exc9;

public class Entry {
	public static void main(String[] args) {
		Account account1 = new Account(1000, "Tuan", 2000);
		account1.display();
		account1.withdraw(2100);
		account1.deposit(600);
		System.out.println("Balance: " + account1.getBalance());
		account1.withdraw(2100);
		System.out.println("Balance: " + account1.getBalance());
	}
}
