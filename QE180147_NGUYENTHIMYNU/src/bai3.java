
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class bai3 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getInformation();
        r1.display();
    }

    static class Rectangle {

        double length, width;

        public void getInformation() {
            Scanner sc = new Scanner(System.in);
            length = sc.nextDouble();
            width = sc.nextDouble();
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return (length + width) * 2;
        }

        public void display() {
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
    }
}
