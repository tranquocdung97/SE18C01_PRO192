/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author ASUS
 */

    public class Triangle {
	private Point1 vertice1;
	private Point1 vertice2;
	private Point1 vertice3;

	public Triangle(Point1 vertice1, Point1 vertice2, Point1 vertice3) {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		vertice1 = new Point1(x1, y1);
		vertice2 = new Point1(x2, y2);
		vertice3 = new Point1(x3, y3);
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

