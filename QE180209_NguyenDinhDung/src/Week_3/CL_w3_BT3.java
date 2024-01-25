/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

import java.util.Scanner;
import java.util.Scanner;

class Rectangle {

    double CD, CR;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        CD = sc.nextDouble();
        CR = sc.nextDouble();
    }

    public double getArea() {
        return CD * CR;
    }

    public double getPerimeter() {
        return (CD + CR) * 2;
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT3 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}
