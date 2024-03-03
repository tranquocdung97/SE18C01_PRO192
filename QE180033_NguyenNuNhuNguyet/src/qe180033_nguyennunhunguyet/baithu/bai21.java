/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;

class Student{
    String name;
    int age;
	public void getInformation(){
        Scanner s=new Scanner(System.in);
        name =s.next();
        age =s.nextInt();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class bai21 {
    public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}
