/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;


/**
 *
 * @author XUAN HIEN
 */
class Point1 {

    private double x;
    private double y;

    public Point1() {

    }

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point1 another) {
        return distance(another.getX(), another.getY());
    }
}

public class bai18 {

    public static void main(String[] args) {
        Point1 p1 = new Point1(1.5, 6.7);
        Point1 p2 = new Point1(2.8, 3.2);
//        System.out.println(p1.distance(p2));
//        System.out.println(p1.distance(2.34, 7.8));
    }
}
