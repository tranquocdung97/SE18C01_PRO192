/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author ASUS
 */
public class bai5 {
    public static void main(String[] args) {
		PolyLine polyLine = new PolyLine();
		polyLine.appendPoint(new Point(1, 1));
		polyLine.appendPoint(new Point(2, 3));
		polyLine.appendPoint(3, 0);
		polyLine.appendPoint(4, 2);
		System.out.println(polyLine.getLength());
	}
}
