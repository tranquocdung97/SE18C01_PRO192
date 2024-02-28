/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismandAbstraction;

/**
 *
 * @author admin
 */
interface IShape {
	public abstract double getArea();

	public abstract double getPerimeter();
}

class Rectangle implements IShape {
	private double length;
	private double width;

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

class Circle implements IShape {
    private static final double Pi = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
    public double getArea() {
        return radius * radius * Pi;
    }

    public double getPerimeter() {
        return radius * 2 * Pi;
    }
}
public class bai30 {
    public static void main(String[] args) {
		IShape[] shapes = new IShape[3];
		shapes[0] = new Rectangle(3.4, 5.3);
		shapes[1] = new Circle(5.5);
		shapes[2] = new Rectangle(7.4, 4.3);
		for (int i = 0; i < 3; i++) {
			System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
			System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
		}
	}
}
