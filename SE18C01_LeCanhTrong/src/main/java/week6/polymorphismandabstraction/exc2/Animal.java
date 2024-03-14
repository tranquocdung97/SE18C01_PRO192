/*
Bạn hãy điền code vào dấu ... để màn hình hiển thị ra thông tin sau:

some sound
bow wow
meow meow
quack quack
 */
package week6.polymorphismandabstraction.exc2;

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
