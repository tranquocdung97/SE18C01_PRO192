/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2.Polymorphism_and_abstraction;

/**
 *
 * @author XUAN HIEN
 */
public class Circle implements IShape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
        @Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}
