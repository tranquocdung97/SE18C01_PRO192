/*
Bạn hãy điền code vào dấu ... để chương trình hiển thị ra màn hình thông tin sau:

Name: Long
Age: 24
Name: Kien
Age: 29
 */
package week3.classesandobjects.exc6;


class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student("Long", 24);
		Student s2 = new Student("Kien", 29);
		s1.display();
		s2.display();
	}
}
