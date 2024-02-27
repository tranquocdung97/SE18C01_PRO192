/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class DX3 {
    /*IShape.java*/
    public interface IShape {

        double getArea();

        double getPerimeter();
    }

    
    /*Rectangle.java*/
    public class Rectangle implements IShape {

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            super();
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return (length + width) * 2;
        }
    }
    /*Circle.java*/
    public class Circle implements IShape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return 3.14 * radius * radius;
        }

        public double getPerimeter() {
            return 2 * 3.14 * radius;
        }
    }
}
