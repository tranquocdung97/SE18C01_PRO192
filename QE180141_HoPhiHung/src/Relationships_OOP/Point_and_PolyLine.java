/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships_OOP;

/**
 *
 * @author Ho Phi Hung
 */

import java.util.ArrayList;
import java.util.List;


public class Point_and_PolyLine {
  
	public static void main(String[] args) {
		PolyLine polyLine = new PolyLine();
		polyLine.appendPoint(new Point(1, 1));
		polyLine.appendPoint(new Point(2, 3));
		polyLine.appendPoint(3, 0);
		polyLine.appendPoint(4, 2);
		System.out.println(polyLine.getLength());
	}
}
 class PolyLine {
	private List<Point> points;

	public PolyLine() {
		points = new ArrayList<Point>();
	}

	public PolyLine(List<Point> points) {
		this.points = points;
	}

	public void appendPoint(Point point) {
		points.add(point);
	}

	public void appendPoint(int x, int y) {
		points.add(new Point(x, y));
	}

	public double getLength() {
		double length = 0;
		for (int i = 0; i < points.size() - 1; i++) {
			int x1 = points.get(i).getX();
			int y1 = points.get(i).getY();
			int x2 = points.get(i + 1).getX();
			int y2 = points.get(i + 1).getY();
			double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			length += distance;
		}
		return length;
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