/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.CL_w3_BT10 to edit this template
 */
package Week_3;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT10 {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
