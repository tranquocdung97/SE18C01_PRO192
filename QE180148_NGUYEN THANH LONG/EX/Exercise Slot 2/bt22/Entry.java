/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt22;

/**
 *
 * @author Admin
 */
public class Entry {
	public static void main(String[] args) {
		Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
		s.display();
		System.out.println();
		Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
		t.display();
	}
}
