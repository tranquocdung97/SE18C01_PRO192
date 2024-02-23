/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationships_OOP;

/**
 *
 * @author Ho Phi Hung
 */
public class moi_quan_he_giua_cac_doi_tuong {
   
	public static void main(String[] args) {
		Point begin = new Point(1, 1);
		Point end = new Point(2, 2);
		Line line1 = new Line(begin, end);
		System.out.println(line1.getLength());

		Line line2 = new Line(2, 3, 5, 4);
		System.out.println(line2.getLength());
	}
}
 class Point {
private int x, y;
public Point(int x, int y){
this.x = x;
this.y = y;
}

public void setX(int x){
this.x = x;
}

public int getX(){
return x;
}

public void setY(int y){
this.y = y;
}

public int getY(){
return y;
}
}


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