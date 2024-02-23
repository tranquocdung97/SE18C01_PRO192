/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet.baithu;

/**
 *
 * @author FPTSHOP
 */
public interface bai30 {
	double getArea();

	double getPerimeter();
}
 class Rectangle implements bai30 {
	private final double length;
	private final double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	
        @Override
	public double getArea() {
		return length * width;
	}

	
        @Override
	public double getPerimeter() {
		return (length + width) * 2;
	}
}
 class Circle implements bai30 {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

        @Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

        @Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}

