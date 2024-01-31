/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

class Rectangle{
	double  length, width;
    public void getInformation()
    {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double area()
    {
        return length * width;
    }
    public double perimeter()
    {
        return (length + width) *2;
    }
    public void display()
    {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class bt2 {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
