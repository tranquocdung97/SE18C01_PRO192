/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */
class Circle {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getCircumference() {
        return 2 * radius * 3.14;
    }
}

public class bai6 {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
