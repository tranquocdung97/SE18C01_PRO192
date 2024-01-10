/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Classes_and_Objects;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;

	public void getInformation() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
	}
    
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.getInformation();
		s.display();
	}
}
