/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class diem_va_hinh_tam_giac {
    

	public static void main(String[] args) {
		Point vertice1 = new Point(1, 3);
		Point vertice2 = new Point(2, 3);
		Point vertice3 = new Point(4, 2);
		Triangle triangle1 = new Triangle(vertice1, vertice2, vertice3);
		Triangle triangle2 = new Triangle(4, 5, 2, 6, 3, 7);
		System.out.println(triangle1.getPerimeter());
		System.out.println(triangle2.getPerimeter());
	}
}
 class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}
}


 class Triangle {
	private Point vertice1;
	private Point vertice2;
	private Point vertice3;

	public Triangle(Point vertice1, Point vertice2, Point vertice3) {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		vertice1 = new Point(x1, y1);
		vertice2 = new Point(x2, y2);
		vertice3 = new Point(x3, y3);
	}

	public double getPerimeter() {
		double d1 = Math.sqrt(Math.pow(vertice1.getX() - vertice2.getX(), 2) 
				+ Math.pow(vertice1.getY() - vertice2.getY(), 2));
		double d2 = Math.sqrt(Math.pow(vertice1.getX() - vertice3.getX(), 2)
				+ Math.pow(vertice1.getY() - vertice3.getY(), 2));
		double d3 = Math.sqrt(Math.pow(vertice2.getX() - vertice3.getX(), 2)
						+ Math.pow(vertice2.getY() - vertice3.getY(), 2));
		return d1 + d2 + d3;
	}
}