/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
class Student{
	String name;
    int age;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class bt83 {
    public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}
