/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author ASUS
 */
public class bai2 {
    public static void main(String[] args) {
		Point1 vertice1 = new Point1(1, 3);
		Point1 vertice2 = new Point1(2, 3);
		Point1 vertice3 = new Point1(4, 2);
		Triangle triangle1 = new Triangle(vertice1, vertice2, vertice3);
		Triangle triangle2 = new Triangle(4, 5, 2, 6, 3, 7);
		System.out.println(triangle1.getPerimeter());
		System.out.println(triangle2.getPerimeter());
	}
}
