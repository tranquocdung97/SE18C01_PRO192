/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships;

/**
 *
 * @author admin
 */
class Line {
private Point begin = new Point(0, 0);
private Point end = new Point(0, 0);

public Line(Point begin, Point end){
this.begin = begin;
this.end = end;
}

public Line(int x1,int y1,int x2,int y2){
this.begin= new Point(x1,y1);
this.end = new Point(x2,y2);
}


public Point getBegin(){
return begin;
}

public void setBegin(Point begin){
this.begin = begin;
}

public Point getEnd(){
return end;
}

public void setEnd(Point end){
this.end = end;
}

public double getLength() {
return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
}
}
public class bai32 {
    public static void main(String[] args) {
		Point begin = new Point(1, 1);
		Point end = new Point(2, 2);
		Line line1 = new Line(begin, end);
		System.out.println(line1.getLength());

		Line line2 = new Line(2, 3, 5, 4);
		System.out.println(line2.getLength());
	}
}
