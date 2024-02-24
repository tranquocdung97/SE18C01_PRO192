/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.object;

/**
 *
 * @author admin
 */
class Student {
	String name;
    int age;
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class bai8 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Tuan", 24);
        students[1] = new Student("Cuong", 25);
        students[2] = new Student("Duc", 24);
		
		
		for (int i = 0; i < 3; i++) {
			students[i].display();
		}
	}
}
