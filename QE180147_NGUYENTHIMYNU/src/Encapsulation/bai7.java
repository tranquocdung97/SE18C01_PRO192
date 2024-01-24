/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author ASUS
 */
public class bai7 {

    public static class Point {

        private double x;
        private double y;

        public Point() {
        }

        public Point(double x, double y) {
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

        public double distance(Point another) {
            return distance(another.getX(), another.getY());
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1.5, 6.7);
        Point p2 = new Point(2.8, 3.2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.34, 7.8));
    }
}
