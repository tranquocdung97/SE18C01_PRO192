/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.List;

class PolyLine {
	private List<Point> points;

	public PolyLine() {
		points = new ArrayList<>();
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
			int x1 = (int) points.get(i).getX();
			int y1 = (int) points.get(i).getY();
			int x2 = (int) points.get(i + 1).getX();
			int y2 = (int) points.get(i + 1).getY();
			double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			length += distance;
		}
		return length;
	}
}
public class bai36 {
    public static void main(String[] args) {
		PolyLine polyLine = new PolyLine();
		polyLine.appendPoint(new Point(1, 1));
		polyLine.appendPoint(new Point(2, 3));
		polyLine.appendPoint(3, 0);
		polyLine.appendPoint(4, 2);
		System.out.println(polyLine.getLength());
	}
}
