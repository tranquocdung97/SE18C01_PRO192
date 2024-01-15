/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Polymorphism_And_Abstraction;

/**
 *
 * @author ASUS
 */
class Animal {
	public void sound() {
		System.out.println("some sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("bow wow");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
	}
}

class Duck extends Animal {
	public void sound() {
		System.out.println("quack quack");
	}
}

public class Entry {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Duck();
		for (int i = 0; i < 4; i++) {
			animals[i].sound();
		}
	}
}
