/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class Rectangle{
    double length, width;
    public void getInformation()
    {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double getArea()
    {
        return length * width;
    }
    public double getPerimeter()
    {
        return (length + width) * 2; 
    }
    public void display()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
public class Exercise2 {
    public static void main(String[]args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}
