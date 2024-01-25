/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.encapsulation.exc6;

public class Entry {
	public static void main(String[] args) {
		Date d = new Date(1, 1, 1997);
		d.display();
		d.setDate(12, 12, 2004);
		d.display();
		d.setMonth(3);
		d.display();
	}
}